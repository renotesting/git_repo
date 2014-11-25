package junitTests;
import static org.junit.Assert.assertTrue;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)//Once read this annotation, go to find
//@FileParameters correlated method and execute.
public class FileReadingParameterizedTest {

    @Test
    @FileParameters("/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa/csvTest.csv")
    public void testWithCSV(String city, String state, int zip) {
    		System.out.println("city is : " +city);
    		System.out.println("state is : " +state);
    		System.out.println("zip is : " +zip);
        assertTrue(zip > 9999 && zip < 100000);
    }
}