package Demo.TestNGProj;

import org.testng.annotations.Test;

import utility.dataproviders.PincodeData;

public class DataProviderDemo {
	
	
	@Test(dataProvider="getData", dataProviderClass = PincodeData.class)
	public void loginTest(String SrNo, String pincode) {
		System.out.println(pincode);
	}
	

}
