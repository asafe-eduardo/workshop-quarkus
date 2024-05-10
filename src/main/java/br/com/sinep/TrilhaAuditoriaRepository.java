package br.com.sinep;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Parameters;
import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;

@ApplicationScoped
public class TrilhaAuditoriaRepository implements PanacheRepository<TrilhaAuditoria> {
    public List<TrilhaAuditoria> testeFiltro(String codigoUsuario) {
        var params = Parameters.with("codigoUsuario", codigoUsuario).map();

        return find("codigoUsuario = :codigoUsuario", params).list();
    }
}
