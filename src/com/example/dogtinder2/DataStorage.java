package com.example.dogtinder2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.Bundle;

import android.content.Context;
import android.util.Log;

public class DataStorage {

	String s = new String(); 
	byte[] currentData;
	
	public String getData(Context c, String key)
	{
		Log.d("ST", key);
		try
		{
			InputStream inputStream = c.openFileInput(key);
			
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String receiveString = "";
            StringBuilder stringBuilder = new StringBuilder();

            while ( (receiveString = bufferedReader.readLine()) != null ) 
            {
            	stringBuilder.append(receiveString);
            }
            
            inputStream.close();
            s = stringBuilder.toString();
		}
		catch(IOException e)
		{
			Log.d("io", "IOException: " + e.getCause());
		}
		
		return s.length() == 0 ? "0" : s; 
	}

	public void setData(Context c, String data, String key){
		
		
		try
		{			
			FileOutputStream fos = c.openFileOutput(key, Context.MODE_PRIVATE);	
			        
	            fos.write(data.getBytes());
            						
				fos.close();
		}
		catch(IOException e)
		{
			Log.d("io", "IOException: " + e.getCause());
		}
	}
	
	/*public void updateData(Context c, String data, String key){
	
		FileOutputStream fos = c.openFileOutput(key, Context.MODE_PRIVATE);	
		
		if(c.openFileInput(key) == null)
		{
			            
	        fos.write(data.getBytes());
	    }
	
	if(c.openFileInput(key) != null)
	{
		InputStream inputStream = c.openFileInput(key);
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        
		fos.write(data.getBytes(), bufferedReader.readLine().getBytes().length, data.length());
	}
            
			fos.close();
	
			
	}*/
}
