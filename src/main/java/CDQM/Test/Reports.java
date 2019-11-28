package CDQM.Test;

import java.io.IOException;

import org.testng.annotations.Test;

public class Reports extends ReportsPage {

	@Test
	 void reports() throws InterruptedException, IOException {
		Reports rep = new Reports();
		
		rep.reportspage();
		
	}
}
