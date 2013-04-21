package dk.stfkbf.opentext;

import com.opentext.livelink.service.core.Authentication;
import com.opentext.livelink.service.core.Authentication_Service;

public class OpenText {

	public static String getAuthenticationToken(String username, String password)
			throws Exception {
		Authentication endpoint;
		String token;
		Authentication_Service service = new Authentication_Service();

		endpoint = service.getBasicHttpBindingAuthentication();
		token = endpoint.authenticateUser(username, password);

		return token;
	}

	public static void main(String[] args) {
		String username = args[0];
		String password = args[1];
		
		System.out.println(username + " " + password);
	}

}
