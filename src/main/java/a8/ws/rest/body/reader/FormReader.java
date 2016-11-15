package a8.ws.rest.body.reader;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

import org.omg.CORBA.NameValuePair;

@Consumes("application/x-www-form-urlencoded")
@Provider

//XXX OJO NameValuePair no creo que sea del paquete de CORBA
public class FormReader implements MessageBodyReader<NameValuePair>{

	@Override
	public boolean isReadable(Class<?> arg0, Type arg1, Annotation[] arg2, MediaType arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public NameValuePair readFrom(Class<NameValuePair> arg0, Type arg1, Annotation[] arg2, MediaType arg3,
			MultivaluedMap<String, String> arg4, InputStream arg5) throws IOException, WebApplicationException {
		// TODO Auto-generated method stub
		return null;
	}

}
