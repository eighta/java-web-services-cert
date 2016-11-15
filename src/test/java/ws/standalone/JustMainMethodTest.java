package ws.standalone;

import javax.xml.ws.Endpoint;

import a8.ws.soap.EightaSoapWs;

public class JustMainMethodTest {

	public static void main(String[] args) {

		System.out.println("BEGIN...");
		Endpoint.publish("http://localhost:8080/EightaSoapWsService", new EightaSoapWs ()); ;
		System.out.println("...END");
		
	}
	
}
