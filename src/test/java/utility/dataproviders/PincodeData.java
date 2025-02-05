package utility.dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.utility.ExcelUtil;

public class PincodeData {
	
	@DataProvider
	public Object[][] getData() throws IOException {
		
		String baseDir = System.getProperty("user.dir");
		Object[][] pincodes = ExcelUtil.loadExcelIntoArray(baseDir+"/src/test/java\\utility\\dataproviders\\PincodeData.xlsx");
		 
		return pincodes;
		
	}

}
