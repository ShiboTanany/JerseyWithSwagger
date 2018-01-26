package com.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import javax.annotation.security.PermitAll;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/test")
@Api
public class TestHello {

	@GET
	
	@ApiOperation(value = "Finds Pets by status",
    notes = "Multiple status values can be provided with comma seperated strings",
    responseContainer = "List")
	@Produces(MediaType.TEXT_PLAIN)
	public String getHello() {

		return "hello";
	}

}
