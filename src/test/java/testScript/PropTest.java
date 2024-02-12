package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropTest {
  @Test
 
	   
	  	public static void main(String[] args) throws IOException {
	  		// TODO Auto-generated method stub
	        
	  		Properties tempProp = new Properties();
	  		String path=System.getProperty("user.dir")+"//src//test//resources//config//config.properties";
	  		FileInputStream fin = new FileInputStream(path);
	  		tempProp.load(fin);
	  		 
	  		 
	  		 
	  		
//	  		uname = tempProp.getProperty("url");
//	  		password = tempProp.getProperty("password");
//	  		System.out.println(uname+password);


	  	}
	   
	  
  
}
