package br.com.minisaas.controller;

import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.minisaas.model.TarefaDTO;

@Stateless // Diz ao WildFly que isso é um EJB(enterprise javabean)
@Path("/tarefas")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TarefaController {

    @POST
    public Response salvarNovaTarefa(TarefaDTO tarefa) {
        System.out.println("=== CHEGOU REQUISIÇÃO DO ANGULAR! ===");
        System.out.println("Título: " + tarefa.getTitulo());
        System.out.println("Descrição: " + tarefa.getDescricao());
        
        // Devolve o status 201
        return Response.status(Response.Status.CREATED).entity(tarefa).build();
    }
}