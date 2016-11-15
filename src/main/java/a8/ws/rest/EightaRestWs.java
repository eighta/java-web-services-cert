package a8.ws.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

//The Java class will be hosted at the URI path "/eighta_rest_ws"
@Path("/eighta_rest_ws")
public class EightaRestWs {

//	ServletContainer a;
	
	// The Java method will process HTTP GET requests
	@GET
	// The Java method will produce content identified by the MIME Media
	// type "text/plain"
	@Produces("text/plain")
	public String getClichedMessage() {
		// Return some cliched textual content
		return "Hello World from REST!";
	}
	
	@POST
	@Consumes("text/plain")
	public void postClichedMessage(String message) {
		// Store the message
	}
	
	
	
}
