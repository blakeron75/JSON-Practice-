package Job;

import java.io.Console;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;



public class Main {

	public static void main(String[] args) throws IOException {
		JSONObject obj = JSONUtils.getJSONObjectFromFile("/adjs.json");
		JSONObject obj1 = JSONUtils.getJSONObjectFromFile("/occupations.json");
		JSONObject obj2 = JSONUtils.getJSONObjectFromFile("/crayola.json");
			
		JSONArray jsonArray = obj.getJSONArray("adjs");
		JSONArray jsonArray1 = obj1.getJSONArray("occupations");
		JSONArray jsonArray2 = obj2.getJSONArray("colors");
		
	
		int counter = 0;
		while(counter < 100) {
			Random r = new Random();
			
			int id1 = r.nextInt(jsonArray.length());
			String word1 = jsonArray.getString(id1);
			
			int id2 = r.nextInt(jsonArray1.length());
			String word2 = jsonArray1.getString(id2);
			
			int id3 = r.nextInt(jsonArray2.length());
			String word3 = jsonArray2.getJSONObject(id3).getString("color");
			
			
			 String strWithoutSpace1 = word2.replaceAll("\\s", "");
			 String strWithoutSpace2 = word3.replaceAll("\\s", "");
			 
			 CaseConverter converter = new CaseConverter();
				
			 String str = converter.camelCase(word1);
			 String str1 = converter.camelCase(strWithoutSpace1);
			 String str2 = converter.camelCase(strWithoutSpace2);
			 
			 String sentence = (str + str2 + str1);
			 System.out.println(sentence);
			 
			 
			 Scanner console = new Scanner(System.in);
			 console.nextLine();
			 
			 counter++;
			 
			 
		}
		
		
		
		
			
	}

	
	
	
}
