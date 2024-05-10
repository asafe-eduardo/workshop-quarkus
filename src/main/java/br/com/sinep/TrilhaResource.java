package br.com.sinep;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/api/v1/trilha")
public class TrilhaResource {

    @Inject
    TrilhaAuditoriaRepository trilhaAuditoriaRepository;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<TrilhaAuditoria> trilhaAuditoriaList(@QueryParam(value = "codigoUsuario") String codigoUsuario) {
        return trilhaAuditoriaRepository.testeFiltro(codigoUsuario);
    }
}
