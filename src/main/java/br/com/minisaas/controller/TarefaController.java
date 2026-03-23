package br.com.minisaas.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import br.com.minisaas.model.Tarefa;
import java.util.List;

@Stateless
@Path("/tarefas")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TarefaController {

    @PersistenceContext(unitName = "MinisaasPU") // Conecta com o que configuramos no persistence.xml
    private EntityManager em;
    
    @GET
    public List<Tarefa> listar() {
    	return em.creatyQuery("SELECT t FROM Tarefa t", Tarefa.class).getResultLiss();
    }
    
    @POST
    public Response salvar(Tarefa tarefa) {
        try {
            // O comando mágico que transforma o objeto Java em uma linha no SQL
            em.persist(tarefa); 
            
            System.out.println("=== TAREFA SALVA NO POSTGRES: " + tarefa.getTitulo());
            
            return Response.status(Response.Status.CREATED).entity(tarefa).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).build();
        }
    }
}