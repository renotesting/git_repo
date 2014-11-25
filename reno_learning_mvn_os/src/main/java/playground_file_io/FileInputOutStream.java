package playground_file_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

//The above code would create file test.txt and would write given numbers in binary format. 
//Same would be output on the stdout screen.

public class FileInputOutStream {
	static String fileName ="/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa/fileioStream.txt";
	   public static void main(String args[]){
   
	   try{
	      byte bWrite [] = {11,21,3,40,5};
	      OutputStream os = new FileOutputStream(fileName);
	      for(int x=0; x < bWrite.length ; x++){
	         os.write( bWrite[x] ); // writes the bytes
	      }
	      os.close();
	     
	      InputStream is = new FileInputStream(fileName);
	      int size = is.available();

	      for(int i=0; i< size; i++){
	         System.out.print((char)is.read() + "  ");
	      }
	      is.close();
	   }catch(IOException e){
	      System.out.print("Exception");
	   }	
	   }

}
