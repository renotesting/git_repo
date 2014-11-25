package basic_learning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExample {
	
	public static void main(String args[]){
		String path = "/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa/test1.txt";
//		File file = new File("/Users/prashantnagar/SQAClass/test/test1.txt");
		File file = new File(path);
		if(file.exists()){
			System.out.println("Deleting the existing file");
		}
		writeFile(file);
		try{
			readFile(file);
		}catch(Exception e){
			System.out.println("Exception caught");
		}				
	}

	//This is delegating the checked exception to caller. To delegate you have to explicitly
	//call the throws Exception code.
	public static void readFile(File file) throws IOException{		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String str = null;
		while((str = reader.readLine()) != null){
			System.out.println("Line is : "+str);
		}
	}

	public static void writeFile(File file){		
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(new FileWriter(file));
			writer.append("data1\n");
			writer.append("data2\n");
			writer.append("data3\n");
		}catch(IOException ioe){
			ioe.printStackTrace();
		}finally{
			if(writer != null){
				try{
					writer.flush();
					writer.close();
				}catch(Exception e){
					System.out.println("Can not close the writers"+e.getMessage());
				}
			}
		}
	}
}
