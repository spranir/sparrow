package org.etl.dsl.singlethread;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import in.chimera.httpclient.ChimeraRestClient;



public class ChimeraRestClientTest {

	@Test
	public void testPOST() {
		String baseURL="https://lab.lasalle.in/fineract-provider/api/v1";
		String userName = "Mifos";
		String password = "duruva123";
		String tenantId = "default";
		String path = "/datatables/CollectionDenomination/312?genericResultSet=true";
		String payload ="{\"Denomination\":\"2000\",\"NoteValue\":\"5\",\"Value\":\"100000\",\"CollectionDate\":\"26 Sep 2017\",\"CollectionTime\":\"1345\",\"GroupLoanId\":\"0987\",\"locale\":\"en\",\"dateFormat\":\"dd MMMM yyyy\"}";
		ChimeraRestClient client = new ChimeraRestClient(baseURL, "Mifos:duruva123:chimeraauth:default");
		client.createAuthToken();
		client.post(path, payload);
		
		
	}
	
	@Test
	public void testSpoors() throws IOException {
		String baseURL="http://nd.spoors.in/effort5-2016/api/createWork?tzo=-330";
		String userName = "Lasalle@Lasalle.in";
		String password = "Lasalle@1";
		
		
		String filePath = this.getClass().getResource("spoors.test.json").getPath();
		String osAppropriatePath = System.getProperty( "os.name" ).contains( "indow" ) ? filePath.substring(1) : filePath;
		String payload =new String(Files.readAllBytes(Paths.get(osAppropriatePath)), StandardCharsets.UTF_8);
		ChimeraRestClient client = new ChimeraRestClient(baseURL, userName+":"+password+":basicauth:default");
		client.createAuthToken();
		client.post("", payload);
	}
	
	
}
