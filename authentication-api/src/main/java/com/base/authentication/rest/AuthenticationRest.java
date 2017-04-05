package com.base.authentication.rest;

import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author viktoras.kisielis
 */
@Component
@Path("/authenticate")
public class AuthenticationRest {

    @GET
    @Produces("application/json")
    @Path("getJwt")
    public String authenticate() {
        return "Here is jwt";
    }
}
