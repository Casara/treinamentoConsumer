package br.com.usuarios.contract;

import br.com.usuarios.contract.facade.ConsultaUsuarioFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
@Api(tags = "usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class RestEndPoint {

    @Autowired
    ConsultaUsuarioFacade consultaUsuarioFacade;

    @GET
    @Path("/nomes")
    @ApiOperation(value = "Listar nomes de usuários", response = String.class, responseContainer = "List")
    public List<String> consultarNomes() {
        return consultaUsuarioFacade.consultarNomes();
    }

    @GET
    @Path("/nomes/filtrar")
    @ApiOperation(value = "Listar nomes de usuários com filtro pelo nome", response = String.class, responseContainer = "List")
    public List<String> consultarNomesComFiltro(@QueryParam("q") String queryString) {
        return consultaUsuarioFacade.consultarNomesComFiltro(queryString);
    }

}
