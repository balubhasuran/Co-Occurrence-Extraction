import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;


public class AbstractExtraction {

public static void main(String[] args)
{
   
    String filePath = "E:\\list\\out.txt";
    BufferedReader br;
    String line = "";
	FileOutputStream fout;
	String [][] arr=new String [1100][2];
	String [][] arr1=new String [1100][100];
	
		int m,n,i=0;
    try {
        br = new BufferedReader(new FileReader(filePath));
		

        try {
            while((line = br.readLine()) != null)
            {
                
			String [] result =	line.split(" ", 2);
				
                        arr[i][0] = result[0];
                        arr[i][1] = result[1];
						i++;
			 }
            br.close();
			  } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
		catch (ArrayIndexOutOfBoundsException e) {
          e.printStackTrace();
      }
    } catch (FileNotFoundException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }					

try
{
    
		
											
	int y=0,z=2;			
				
							for(n=0;n<i;n++)	
							{
								
								for( m=n+1;m<i;m++)
									{
									
										if (arr[n][0].equals(arr[m][0]))
										{
									        
											arr1[y][z]=arr[m][1];
											
											z++;
																		
										}
										else
										{
										break;
										}
										
									}
											arr1[y][0]=arr[n][0];
											arr1[y][1]=arr[n][1];
											
											y++;
											
											z=2;
											n=m-1;
																
									
							}
						
				
							for(n=0;n<arr1.length;n++)
							{
								for(m=0;m<arr1[n].length;m++)
								{
									if(arr1[n][m]==null)
									{
								            	break;
									}
									else
									{
								      System.out.print(arr1[n][m]+"\t");
									}
								}
								System.out.println();
							}
	}
	catch (ArrayIndexOutOfBoundsException e) {
          e.printStackTrace();
      }
      
}
}