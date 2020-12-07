package resource;

import model.CalcService;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/calc")
public class CalcResource {

    @EJB
    private CalcService calcService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllCities() {
        return Response.ok(calcService.getAllCities()).build();
    }

    /*
     TODO: Add a method to perform calculations
     TODO: Add a method to load data into the database
    */
}
