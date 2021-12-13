package org.acme.rest.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/country")
public class CountriesResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sum() {
        
        return "Hello RESTEasy";
    }


    @Path("/getnumbers")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getNumbers() {
        
        return "Hello RESTEasy";
    }


    
}