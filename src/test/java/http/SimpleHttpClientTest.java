package http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleHttpClientTest {

	String fixedUrl = "http://localhost:8080/java-web-services-cert/";
	
	@Test
	public void usingUrlConnection() throws IOException{
		
		// Parse the URL.
		URL url = new URL(fixedUrl);
		
		//Connect
		URLConnection sock = url.openConnection();
		
		//Print response
		InputStream inputStream = sock.getInputStream();
		printResponse(inputStream);
	}
	
	@Test
	@Ignore
	public void getHttpRequest() throws UnknownHostException, IOException{
		
		// Parse the URL.
		URL url = new URL(fixedUrl);
		String host = url.getHost();
		String path = url.getPath();
		int port = url.getPort();
		
		// Send the request.
		String request = "GET " + path + " HTTP/1.1\n";
		request += "host: " + host;
		request += "\n\n";
		
		sendHttpNativeRequest(host, port, request);
	}
	
	private void printResponse(InputStream responseFromRequest) throws IOException {
		
		// Read and print the response.
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(responseFromRequest));
		
		String next_record = null;
		while ((next_record = reader.readLine()) != null){
			System.out.println(next_record);
		}
		reader.close();
		
	}

	private void sendHttpNativeRequest(String host, int port, String request) throws UnknownHostException, IOException{
		
		Socket sock = new Socket(host, port);
		PrintWriter writer = new PrintWriter(sock.getOutputStream());
		writer.print(request);
		writer.flush();
		
		InputStream responseFromRequest = sock.getInputStream();
		printResponse(responseFromRequest);
		sock.close();
	}
}
