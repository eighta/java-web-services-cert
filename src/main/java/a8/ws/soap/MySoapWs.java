package a8.ws.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface MySoapWs {

	@WebMethod
	public String businessMethod();
	
}
