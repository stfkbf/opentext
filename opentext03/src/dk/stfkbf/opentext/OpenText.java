package dk.stfkbf.opentext;

import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPHeaderElement;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;

import com.opentext.ecm.api.OTAuthentication;
import com.opentext.livelink.service.core.Authentication;
import com.opentext.livelink.service.core.Authentication_Service;
import com.opentext.livelink.service.docman.DocumentManagement;
import com.opentext.livelink.service.docman.DocumentManagement_Service;
import com.opentext.livelink.service.docman.Node;
import com.sun.xml.ws.api.message.Header;
import com.sun.xml.ws.api.message.Headers;
import com.sun.xml.ws.developer.WSBindingProvider;

public class OpenText {

	private static final String ECM_API_NAMESPACE = "urn:api.ecm.opentext.com";

	public static String getAuthenticationToken(String username, String password)
			throws Exception {
		Authentication endpoint;
		String token;

		Authentication_Service service = new Authentication_Service();

		endpoint = service.getBasicHttpBindingAuthentication();

		token = endpoint.authenticateUser(username, password);

		return token;
	}

	public static DocumentManagement getDMService(String authToken)
			throws Exception {

		DocumentManagement_Service service = new DocumentManagement_Service();
		DocumentManagement endpoint = service
				.getBasicHttpBindingDocumentManagement();
		OTAuthentication otAuth = new OTAuthentication();

		otAuth.setAuthenticationToken(authToken);

		setSoapHeader((WSBindingProvider) endpoint, otAuth);

		return endpoint;
	}

	public static void setSoapHeader(WSBindingProvider bindingProvider,
			OTAuthentication otAuth) throws Exception {
		List<Header> headers = new ArrayList<Header>();
		SOAPMessage message = MessageFactory.newInstance().createMessage();
		SOAPPart part = message.getSOAPPart();
		SOAPEnvelope envelope = part.getEnvelope();
		SOAPHeader header = envelope.getHeader();

		headers.add(getOTAuthenticationHeader(header, otAuth));

		bindingProvider.setOutboundHeaders(headers);
	}

	public static Header getOTAuthenticationHeader(SOAPHeader header,
			OTAuthentication otAuth) throws Exception {
		SOAPHeaderElement otAuthElement;
		SOAPElement authTokenElement;

		otAuthElement = header.addHeaderElement(new QName(ECM_API_NAMESPACE,
				"OTAuthentication"));
		otAuthElement.setPrefix("");

		authTokenElement = otAuthElement.addChildElement(new QName(
				ECM_API_NAMESPACE, "AuthenticationToken"));
		authTokenElement.setPrefix("");

		authTokenElement.addTextNode(otAuth.getAuthenticationToken());

		return Headers.create(otAuthElement);
	}

	public static Node configureNode(Node parent, String name){
		Node compoundDoc = new Node();
		
		compoundDoc.setDisplayType(parent.getDisplayType());
		compoundDoc.setType(parent.getType());
		compoundDoc.setParentID(parent.getID());
		compoundDoc.setName(name);
		
		return compoundDoc;
	}
	
	public static void main(String[] args) throws Exception {
		String username = args[0];
		String password = args[1];

		System.out.println(username + " " + password);

		String token = getAuthenticationToken(username, password);

		System.out.println(token);

		try {
			DocumentManagement dm = getDMService(token);

			// call the method
			Node folder = dm.getNode(17357832);
		
			Node compoundDoc = new Node();
			compoundDoc.setDisplayType(folder.getDisplayType());
			compoundDoc.setType(folder.getType());
			compoundDoc.setParentID(folder.getID());
			compoundDoc.setName("101012 - Barclays");			
			compoundDoc = dm.createNode(compoundDoc);
			
			Node childDoc;
			
			childDoc = configureNode(compoundDoc, "Supervision");
			childDoc = dm.createNode(childDoc);
			
			Node childDoc2;
			childDoc2 = configureNode(childDoc, "Cancellations");
			childDoc2 = dm.createNode(childDoc2);
			
			childDoc2 = configureNode(childDoc, "Change of Control");
			childDoc2 = dm.createNode(childDoc2);
			
			childDoc2 = configureNode(childDoc, "Close and Continuous Supervision");
			childDoc2 = dm.createNode(childDoc2);
			
			childDoc = configureNode(compoundDoc, "Data and Management Information");
			childDoc = dm.createNode(childDoc);
			
			childDoc = configureNode(compoundDoc, "Enforcement");
			childDoc = dm.createNode(childDoc);
			
			System.out.println(folder.getName());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}
