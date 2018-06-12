package br.com.usuarios.contract;

import br.com.usuarios.contract.facade.ConsultaUsuarioFacade;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/usuarios")
@Api(value = "usuarios", description = "Usuários", produces = MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestEndPoint {
    @Autowired
    ConsultaUsuarioFacade consultaUsuarioFacade;

    @GET
    @Path("/nomes")
    @ApiOperation(value = "Listar nomes de usuários")
    @ApiResponses(@ApiResponse(
            code = 200,
            response = List.class,
            message = "Consulta de nomes de usuários efetuada com sucesso."
    ))
    public List<String> consultarNomes() {
        return consultaUsuarioFacade.consultarNomes();
    }

    @GET
    @Path("/nomes/filtrar")
    @ApiOperation(value = "Listar nomes de usuários com filtro pelo nome")
    @ApiResponses(@ApiResponse(
            code = 200,
            response = List.class,
            message = "Consulta de nomes de usuários com filtro pelo nome efetuada com sucesso."
    ))
    public List<String> consultarNomesComFiltro(@QueryParam("q") String queryString) {
        return consultaUsuarioFacade.consultarNomesComFiltro(queryString);
    }
}
