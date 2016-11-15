package a8.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/response_builder_ws")
public class ResponseBuilderWs {

	@GET
	public Response getItem() {
		
		Object entity = "SOPHIE OCHOA (ResponseBuilder)";
		MediaType mediaType = MediaType.TEXT_PLAIN_TYPE;
		return Response.ok(entity,mediaType).build();
		
	}
	
}
