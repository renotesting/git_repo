package playground_file_io;

import java.io.File;


public class File_method {

	   public static void main(String args[]) {
		String path = "/Users/gangliu/Dropbox/SQA_Reno_local/logs/sqa"; 
		
//		Create a folder

	      String dirname = path+"/tmp/user/java/bin";
	      File d = new File(dirname);
	      // Create directory now.
	      d.mkdirs();
	      
//	      use list( ) method provided by File object to list 
//	      down all the files and directories available in a directory 
	      
	      File file = null;
	      String[] paths;
	            
	      try{      
	         // create new file object
	         file = new File(path);
	                                 
	         // return an array of files and directory
	         paths = file.list();
	            
	         // for each name in the path array
	         for(String path1:paths)
	         {
	            // prints filename and directory name
	            System.out.println(path1);
	         }
	      }catch(Exception e){
	         // if any error occurs
	         e.printStackTrace();
	      }
	      

	  }

}
