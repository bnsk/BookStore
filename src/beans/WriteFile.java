package beans;

import java.io.*;

public class WriteFile {
	private PrintWriter out;
	private static WriteFile st=null;

	private WriteFile(String fName){
		 try{
	    	 out= new PrintWriter(new FileWriter(fName,true)); 
	         }
	   
		   catch(IOException e){//Catch exception if any
			   e.printStackTrace();
		   }	
	}
	public void write(String s){
		  out.println(s);
		 out.flush();
		  }
		
		 public static WriteFile getInstance(String filename){
		  if(st==null) {
			  synchronized(WriteFile.class){
				  if(st==null)
			         st=new WriteFile(filename);
			  }
		  }
			return st;
		 }
public void close()
{
	out.close();
}		 	

}