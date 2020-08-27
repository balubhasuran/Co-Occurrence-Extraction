import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Frequency {

public static void main(String[] args)
{
   
    String filePath = "F:\\result\\4 final out\\lks.txt";
    BufferedReader br;
    String line = "";
	
	List<String> list = new ArrayList<String>();
		int m,n,i=0;
    try {
        br = new BufferedReader(new FileReader(filePath));
		

        try {
            while((line = br.readLine()) != null)
            {
                
			list.add(line);
				
			 }
            br.close();
			  } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }					
Set<String> unique = new HashSet<String>(list);
for (String key : unique) {
    System.out.println(key + " " + Collections.frequency(list, key));
}
      
}
}