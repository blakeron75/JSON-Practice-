package Job;

import java.io.InputStream;

public class randomWords {

	public static InputStream inputStreamFromFile(String path) {
		try {
			InputStream inputStream = randomWords.class.getResourceAsStream(path);
			return inputStream; 
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
		
		
		return null;
		
	}

}
