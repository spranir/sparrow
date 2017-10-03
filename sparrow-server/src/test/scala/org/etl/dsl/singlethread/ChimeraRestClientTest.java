package org.etl.dsl.singlethread;
import java.io.IOException;


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
	
	
}
