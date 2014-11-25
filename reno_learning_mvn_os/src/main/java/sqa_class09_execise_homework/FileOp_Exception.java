package sqa_class09_execise_homework;

//1.	Write a class that writes a file with name of 10 countries in 10 lines.
//2.	If the file already exists then delete the file first.
//3.	Print the name and absolute path of the file once file is written.
//4.	Read the file and print it in the console and also in the log file.
//5.	Also count and print total number of rows in the file.


import java.io.File;

public class FileOp_Exception {

	public static void main(String[] args) {
		String path = "/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa/test1.txt"; 
		File file = new File(path);
		
		writeFile(file);
		
		readFile(file);

	}
	
	static void writeFile(File file){
		if (file.exists())
			file.delete();

	}
	
	static void readFile(File file)throws Exception{
	
	}

}
