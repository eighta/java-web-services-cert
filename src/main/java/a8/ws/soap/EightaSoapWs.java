package a8.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class EightaSoapWs
{

	@WebMethod
	public String businessMethod(){
		return "hello-from-here";
	}
	
}
