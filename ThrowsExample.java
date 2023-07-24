
package com.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {

	String st=null;
	BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

	void test() throws IOException 
	{
		st=bufferedReader.readLine();
		if(st==null)
		{
			try
			{
				FileNotFoundException ob=new FileNotFoundException("String is null");
				throw ob;
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
			finally
			{
				System.out.println(st.length());
			}
		}
		
	}

	
	
	public static void main(String[] args) {
		
	       BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));

	}

}