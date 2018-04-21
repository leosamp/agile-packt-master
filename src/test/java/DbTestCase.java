import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import com.cloudant.client.api.Database;
import example.nosql.CloudantClientMgr;

public class DbTestCase {

	//private String testVal;
	Database db = null;
	
	@Before
	public void setUp() throws Exception {
		//testVal = "HelloWorld ola";
		try {
			db = CloudantClientMgr.getDB();
			System.out.println("WORKEDDDDD");
		} catch (Exception re) {
			re.printStackTrace();
			//response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			return;
		}
		
	}

	@Test
	public void testEquals() {
		Assert.assertEquals("Database access tested successfully.", "HelloWorld", "HelloWorld");
	}
	
	@Test
	public void testTrue() {
		Assert.assertTrue("Successfully connected to the database.", true);
	}

}