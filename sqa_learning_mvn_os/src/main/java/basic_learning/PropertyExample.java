package basic_learning;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyExample {
	
	public static void main(String args[]){
		Properties props = readTestProperties("/Users/prashantnagar/SQAClass/input/input.propeties");
		System.out.println(props.getProperty("INR"));
		System.out.println(props.getProperty("USD"));
		props.setProperty("USD", "abc");
		System.out.println(props.getProperty("USD"));
	}
	
	public static Properties readTestProperties(String fileName) {
		Properties props = new Properties();
		InputStream in = null;
		BufferedReader reader = null;
		try {
			in = new FileInputStream(fileName);
			reader = new BufferedReader(new FileReader(fileName));
			props.load(reader);
			props.load(in);			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {			
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return props;
	}
	
	public static String getProperty(String key){
		return "abc";
	}
}
