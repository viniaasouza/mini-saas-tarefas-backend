package br.com.minisaas.config;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider // Esta anotação diz ao servidor: "Ei, aplique este filtro em TODAS as rotas!"
public class CorsFilter implements ContainerResponseFilter {

    @Override
    public void filter(ContainerRequestContext requestContext, 
                       ContainerResponseContext responseContext) throws IOException {
        
        // Dá permissão para qualquer site (o "*" significa todos) acessar nossa API
        responseContext.getHeaders().add("Access-Control-Allow-Origin", "*");
        // Diz quais tipos de "envelope" o Angular pode mandar (ex: JSON/Content-Type)
        responseContext.getHeaders().add("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
        // Permite os métodos clássicos do REST
        responseContext.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, HEAD");
    }
}