package playground_file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//http://www.mkyong.com/java/how-to-read-file-from-java-bufferedreader-example/
public class BufferedReader_method {

	public static void main(String[] args) {
		String pathFile = "/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa/fileioStream.txt";
		fileReader(pathFile);

	}

	public static void fileReader(String pathFile) {
		File file = new File(pathFile);
		String content = null;
		FileReader fr = null;
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(file));
			while ((content = br.readLine()) != null){
			System.out.println(content);
			}
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			System.out.println("File is not found..");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

	}

}
