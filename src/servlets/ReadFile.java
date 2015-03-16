package servlets;

import java.util.*;
import java.lang.*;
import java.io.*;

public class ReadFile{
 private static ReadFile rF = null; 
  public static ReadFile getInstance(String fName) {
    if (rF == null) {
      synchronized (ReadFile.class) {
        
        if (rF == null)
          rF = new ReadFile(fName);
      }
    }
    return rF;
  }
	BufferedReader inputStream;
String c;
String name;
FileReader filestream;
public ReadFile(String fname)
{
		File inputfile=new File(fname);

		try
		{
			filestream = new FileReader(inputfile);
		}
			catch(FileNotFoundException e)
			{
			System.err.println("Cant read the file");
			e.printStackTrace();
		    }
	   inputStream=new BufferedReader(filestream);
}

	public ReadFile() {
	// TODO Auto-generated constructor stub
}

	public String readline()
	{
		try
		{
		  return inputStream.readLine();
	    }
	    catch(IOException e)
	    {
		  e.printStackTrace();
		}
		return null;
	}

	void close()
	{
		try{inputStream.close();
		  filestream.close();
		}catch(IOException e){}
	}
}


