import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadConfig {
	

	FileInputStream fis; 
	File file;
	
	
public Properties readConfigDetails() {
		
	String Filepath="C:\\Softwares\\Myprograms\\FirstTestNGProject\\datafile.properties" ;	
	Properties prop = new Properties();	
		
		try {
			
			file = new File(Filepath);
			
			if(!file.exists()) {
				throw new FileNotFoundException();
			}
			fis = new FileInputStream(file);
			prop.load(fis);
			
/*			setUrl(prop.getProperty("url"));
			setUsername(prop.getProperty("username"));
			setPassword(prop.getProperty("password"));
*/			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return prop;
		
		
	}

@Test
public void testconfig() {
	
	ReadConfig readConfig = new ReadConfig();
	
	Properties prop = readConfig.readConfigDetails();
	System.out.println(prop.getProperty("username"));
}

}
