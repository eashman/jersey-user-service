package org.dynamicsimulations.openfire.plugin.servlet.exception;

import org.dynamicsimulations.openfire.plugin.servlet.response.ErrorResponse;

import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class UserNotFoundException extends WebApplicationException {

    public UserNotFoundException(final Exception e) {
        super(Response.status(200)
                .entity(new ErrorResponse(e))
                .type(MediaType.APPLICATION_JSON)
                .build());
    }
}