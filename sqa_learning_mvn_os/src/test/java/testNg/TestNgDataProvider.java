package testNg;

import org.apache.log4j.Logger;
import org.testng.annotations.DataProvider;

public class TestNgDataProvider {
	Logger log = Logger.getLogger(TestNgDataProvider.class);
	
	@DataProvider(name = "test1")
	public static Object[][] primeNumbers() {
		return new Object[][] { { 2, true }, { 6, false }, { 19, true },
				{ 22, false }, { 23, true } };
	}
	
	@DataProvider(name = "addInput")
	public static Object[][] getCalcAddData(){
		return new Object[][] { { 2, 2,4}, {3,3,6}, { 4,4,8}};
//		Object[][] add2dArr = new Object[3][3];
//		add2dArr[0][0] = 2;
//		add2dArr[0][1] = 2;
//		add2dArr[0][2] = 4;
//		add2dArr[1][0] = 3;
//		add2dArr[1][1] = 3;
//		add2dArr[1][2] = 6;
//		add2dArr[2][0] = 4;
//		add2dArr[2][1] = 4;
//		add2dArr[2][2] = 8;		
	}

}
