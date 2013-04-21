package dk.stfkbf.opentext;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;

import com.opentext.livelink.service.core.Authentication;
import com.opentext.livelink.service.core.Authentication_Service;

public class OpenText {

	public static String getAuthenticationToken(String username, String password)
			throws Exception {
		Authentication endpoint;
		String token;
		
		
		Authentication_Service service = new Authentication_Service();
		// Authentication_JAXWS
		
		if (System.getProperty("http.proxyHost") != null && 
				System.getProperty("http.proxyPort") != null) {		
				SocketAddress addr = new InetSocketAddress(System.getProperty("http.proxyHost"), new Integer(System.getProperty("http.proxyPort")));
				Proxy proxy = new Proxy(Proxy.Type.HTTP, addr);
				//enterpriseConfig.setProxy(proxy);	
				
			}
		
		endpoint = service.getBasicHttpBindingAuthentication();
		
		token = endpoint.authenticateUser(username, password);

		return token;
	}

	public static void main(String[] args) throws Exception {
		String username = args[0];
		String password = args[1];
		
		System.out.println(username + " " + password);
		
		String token = getAuthenticationToken(username, password);
		
		System.out.println(token);
	}

}
