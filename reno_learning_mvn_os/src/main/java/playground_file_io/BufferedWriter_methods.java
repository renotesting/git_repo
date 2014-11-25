package playground_file_io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//http://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/
	
public class BufferedWriter_methods {

	public static void main(String[] args) {

		// creates the file
		String pathFile = "/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa/fileioStream.txt";
		String[] cryArr = new String[]{"Germany", "Indian", "Taiwan", "Hongkon"};
		fileWriter(pathFile, cryArr);
	}
	
	public static void fileWriter(String pathFile, String[] ctyArr){
		BufferedWriter bw = null;

		try {
			File file = new File(pathFile);
			bw = new BufferedWriter(new FileWriter(file));
			// creates a FileWriter Object given file object
			// Creates a buffered character-output stream that uses a
			// default-sized
			// output buffer, given a FileWriter object.
			bw.append("China\n");
			bw.write("USA\n");
			bw.write("canada\n");
			bw.newLine();
			bw.append("Calgary\n");
			for(String cty: ctyArr){
				bw.write(cty);
				bw.newLine();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (bw != null) {
				try {
					bw.flush();
					bw.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
