import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class CooccurrenceMatrix {

public static void main(String[] args)
{
    
	//int r=0;
    String lineNumber = "";
    String filePath = "E:\\Sir\\Co-occurrence\\3co mat\\DB.txt";;
	String filePath1 = "E:\\Sir\\Co-occurrence\\\\3co mat\\GENE_TERMS.txt";
    BufferedReader br,br1;
   // String inputSearch = "Search";
    String line = "";
	    String str= "";
	String gene="";
	
	int count=0;
	 ArrayList<String> list = new ArrayList<String>();

    try {
         br = new BufferedReader(new FileReader(filePath));
		
		


        try {
            while((line = br.readLine()) != null)
             {
                 
				
			      String [] result =line.split("\t", 2);
				
                        String first = result[0];
						
                        String searchMe= result[1];
						Pattern re = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
    Matcher reMatcher = re.matcher(searchMe);
    while(reMatcher.find()) {
			br1 = new BufferedReader(new FileReader(filePath1));                              
							  str=   reMatcher.group();
							   count=0;
		
		 
			                                          while((gene = br1.readLine()) != null)
                                                    {
															String findMe=gene;
							findMe="<Gene>"+gene+"</Gene>";
															if(gene.contains("+"))
							{
								String[] result1=gene.split("\\+",2);
								String pat="(?i)\\b"+result1[0]+"\\+"+result1[1]+"\\b";
								Pattern res = Pattern.compile(pat);
							Matcher reMatchers = res.matcher(str);
								if(reMatchers.find()) {
			                                count++;
							  
							   str= str.replaceAll(pat,findMe);
							   
							  
															}
								
							}
							else
							{															
															String pat="(?i)\\b"+gene+"\\b";
						
							Pattern res = Pattern.compile(pat);
							Matcher reMatchers = res.matcher(str);
								if(reMatchers.find()) {
			                              
							  count++;
							   str= str.replaceAll(pat,findMe);
							  
							   
															}
																							                   
													}
												
												
												
	}				
	if(count>=2)
											
					System.out.println(first+"\t"+str);
															
	   br1.close();
	}
												
	               
				

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

   // System.out.println("Times found at--"+count);
    //System.out.println("Word found at--"+lineNumber);
}
}