import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class FrequencyExtractor1 {

public static void main(String[] args)
{
   
    String filePath = "F:\\result\\4 final out\\cooccur.txt";
    BufferedReader br;
    String line = "";
	
	
		int m,n,i=0;
    try {
        br = new BufferedReader(new FileReader(filePath));
		

        try {
            while((line = br.readLine()) != null)
            {
                
			String [] result =	line.split("	", 2);
				System.out.println(result[1]);
				
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

      
}
}