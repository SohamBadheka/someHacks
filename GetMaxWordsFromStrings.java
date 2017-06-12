package basic;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class GetMaxWordsFromStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello word. how are you! I hope  you are doing fine.";
		GetMaxWordsFromStrings gs = new GetMaxWordsFromStrings();
		int max = gs.recieveData(s);
		System.out.println("output is "+max);
	}
	
	public int recieveData(String stringParse){
				
		        String newString = stringParse.replace("?",".");
		        String updatedString = newString.replace("!",".");
		        String[] str = updatedString.split(Pattern.quote("."));
		   
		        String[] tokens;
		        ArrayList<String> tkn = new ArrayList<String>();
		        int max_len = 0;
		        
		         for(int i = 0; i<str.length; i++){
		             tokens = str[i].split(" ");
		            
		              for(int j = 0; j<tokens.length; j++){
		                  if(tokens[j].length()>=1){
		                      tkn.add(tokens[j]);
		                    
		                  }    
		              }
		              if(max_len<tkn.size())
		            	  max_len = tkn.size();
		              tkn.clear();
		         }
		        return max_len;
		    }
}
