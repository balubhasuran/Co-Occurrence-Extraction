import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class Tag {

public static void main(String[] args)
{
    String filePath = "D:\\result\\1tagging\\pu1.txt";
	String filePath1 = "D:\\result\\1tagging\\genes.txt";
    BufferedReader br,br1;
    String line = "";
	String gene="";
	String res="";
String searchMe="";
    try {
         br = new BufferedReader(new FileReader(filePath));
		
	        try {
            while((line = br.readLine()) != null)
             {
			  br1 = new BufferedReader(new FileReader(filePath1));
                String [] result =line.split(" ", 2);
				
                        String first = result[0];
                      						
						int searchMeLength = searchMe.length();
                
														while((gene = br1.readLine()) != null)
                                                    {
															
															String findMe=gene;
															searchMe= result[1];
															gene="<B><I><u>"+gene+"</B></I></u>";
															
																								if (searchMe.contains(findMe)) {
																								
																									//System.out.println(findMe);
																				result[1]=searchMe.replaceAll(findMe,gene);		
																							
																														       }
																							                   
      
													}
												
												 System.out.print(result[0]+" ");	
												 System.out.println(result[1]);
				br1.close();
				}									
            
			 br.close();
			
		
        } catch (IOException e) {
            
            e.printStackTrace();
								}
		
   
    
    } catch (FileNotFoundException e) {
       
        e.printStackTrace();
									  }

  }
}