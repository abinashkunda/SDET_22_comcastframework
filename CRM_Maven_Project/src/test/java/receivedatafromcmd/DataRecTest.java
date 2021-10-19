package receivedatafromcmd;

import org.testng.annotations.Test;

public class DataRecTest {

	@Test
	public void dataRec() {
		String URL = System.getProperty("url");
		System.out.println(URL);
	}
}
