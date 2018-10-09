package in.chimera.httpclient;
import org.etl.httpclient.SpoorsRestClient;
import org.junit.Test;

public class ChimeraRestClientTest {

	/*@Test
	public void testPOST() {
		String baseURL="https://lab.lasalle.in/fineract-provider/api/v1";
		String userName = "Mifos";
		String password = "duruva123";
		String tenantId = "default";
		String path = "/groups/2370?command=saveCollectionSheet";
		String payload ="{\"bulkRepaymentTransactions\":[{\"transactionAmount\":\"335.00\",\"loanId\":\"27789\"}],\"calendarId\":\"1061\",\"dateFormat\":\"dd MMMM yyyy\",\"clientsAttendance\":[{\"attendanceType\":\"2\",\"clientId\":\"19415\"}],\"locale\":\"en\",\"transactionDate\":\"02 November 2017\",\"actualDisbursementDate\":\"2017-08-06\"}";
		HandymanRestClient client = new HandymanRestClient(baseURL, userName+":"+password+":chimerauth:"+tenantId);
		client.createAuthToken();
		client.post(path, payload);
		
		
	}*/
	
	@Test
	public void testPOST1() {
		/*String baseURL=	"http://121.241.249.215:8095/effort6-api/service/api/all?userName=lasalle​";*/
		String baseURL=	"http://nd.spoors.in/effort5-2016/service/api/all?userName=lasalle";
		String another="lasalle4151@!";
		String payload = "{\"works\":[{\"ff_Branch\":\"Ayyampettai\",\"ff_Collection_Date\":\"2017-12-20 00:00:00\",\"ff_Clients_Name\":\"39552,39576,39580,39581,39583,39586,39588,39589,39591,39592,39594,39595,39597,39599,39602,39603\",\"workSpecExternalId\":\"2812\",\"ff_Center_Name\":\"4411\",\"externalId\":\"35469573613941399086\",\"ff_Employee\":\"344\",\"ff_Disbursement_Date\":\"2017-10-17\",\"ff_Calendar_Id\":\"1970\",\"ff_Starts\":\"2017-12-20 16:24:57\"}],\"lists\":[{\"ef_Installment\":\"\",\"entitySpecId\":\"39385\",\"ef_Center_Name\":\"muthalamman aymp group\",\"listNo\":\"4411\",\"ef_Loan_Id\":\"\",\"ef_Client_Id\":\"\",\"ef_EMI_amount\":\"\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39552\",\"ef_Loan_Id\":\"44344\",\"ef_Client_Id\":\"39552\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"thavamani murugaiyan\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39576\",\"ef_Loan_Id\":\"44345\",\"ef_Client_Id\":\"39576\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"tamil arasi uthrapathy\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39580\",\"ef_Loan_Id\":\"44346\",\"ef_Client_Id\":\"39580\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"sasikala sundaramoorthy\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39581\",\"ef_Loan_Id\":\"44347\",\"ef_Client_Id\":\"39581\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"muniyammal ravi\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39583\",\"ef_Loan_Id\":\"44348\",\"ef_Client_Id\":\"39583\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"kokila elaiyaraja\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39586\",\"ef_Loan_Id\":\"44349\",\"ef_Client_Id\":\"39586\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"jayagandhi annadurai\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39588\",\"ef_Loan_Id\":\"44350\",\"ef_Client_Id\":\"39588\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"suriyakala paramasivan\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39589\",\"ef_Loan_Id\":\"44351\",\"ef_Client_Id\":\"39589\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"rajathi selvaraj\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39591\",\"ef_Loan_Id\":\"44352\",\"ef_Client_Id\":\"39591\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"revathi kasirajan\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39592\",\"ef_Loan_Id\":\"44353\",\"ef_Client_Id\":\"39592\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"vinotha senthil kumar\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39594\",\"ef_Loan_Id\":\"44354\",\"ef_Client_Id\":\"39594\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"yelammal thesnamoorthy\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39595\",\"ef_Loan_Id\":\"44355\",\"ef_Client_Id\":\"39595\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"sangeetha sanjaighandhi\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39597\",\"ef_Loan_Id\":\"44356\",\"ef_Client_Id\":\"39597\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"maheswari senkuttuvan\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39599\",\"ef_Loan_Id\":\"44357\",\"ef_Client_Id\":\"39599\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"valarmathi nadarajan\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39602\",\"ef_Loan_Id\":\"44358\",\"ef_Client_Id\":\"39602\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"susila rajmohan\"},{\"ef_Installment\":\"9\",\"entitySpecId\":\"39388\",\"ef_Center_Name\":\"4411\",\"listNo\":\"39603\",\"ef_Loan_Id\":\"44359\",\"ef_Client_Id\":\"39603\",\"ef_EMI_amount\":\"335.000000\",\"ef_Center_Id\":\"4411\",\"ef_Client_Name\":\"tamilselvi karthick\"}],\"uniqueidentifier\":\"504\",\"timestamp\":\"2017-12-20 16:24:57.0\"}";
		String path = "";
		SpoorsRestClient client = new SpoorsRestClient(baseURL, another,"jwt");
		/*client.createAuthToken();*/
		client.post(path,payload);
		
	/*	String payload ="{\"works\":[{}]}";
		String res = client.post(path, payload);*/		
	}

}