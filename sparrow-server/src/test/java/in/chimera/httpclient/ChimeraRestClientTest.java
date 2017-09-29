package in.chimera.httpclient;
import org.junit.Test;

public class ChimeraRestClientTest {

	@Test
	public void testPOST() {
		String baseURL="https://lab.lasalle.in/fineract-provider/api/v1";
		String userName = "Spoors";
		String password = "spoors@duruva";
		String tenantId = "default";
		String path = "/datatables/CollectionDenomination/312?genericResultSet=true";
		String payload ="{\"Denomination\":\"2000\",\"NoteValue\":\"5\",\"Value\":\"100000\",\"CollectionDate\":\"26 Sep 2017\",\"CollectionTime\":\"1345\",\"GroupLoanId\":\"0987\",\"locale\":\"en\",\"dateFormat\":\"dd MMMM yyyy\"}";
		ChimeraRestClient client = new ChimeraRestClient(baseURL, userName+":"+password+":chimerauth:"+tenantId);
		client.createAuthToken();
		client.post(path, payload);
		
		
	}

}
