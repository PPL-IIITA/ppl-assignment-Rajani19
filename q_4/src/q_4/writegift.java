/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class writegift {
    private static final String comma = ",";
    void makegift(int size) throws IOException
    {
        FileWriter fwOb = new FileWriter("gift.csv", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
        
        String s,output;
        int n;
       // this will make gift.csv
       // format is = price,value,type
        String[] type = new String[]{"essential", "luxury", "utility"}; 
         
       
        Random random = new Random(); 
        FileWriter fileWriter = null; 
        try{
            fileWriter = new FileWriter("gift.csv", true);
            for(int i =0;i<size;i++)
                {   
                     
                     for(int k =0;k < 2;k++)
                     {  n = random.nextInt(50) + 1;
                        s = Integer.toString(n);
                       
                        fileWriter.append(s);
                        fileWriter.append(comma);
                     }
                     n = random.nextInt(10) + 1;
                     n = n%3;
                     s = type[n];
                    fileWriter.append(s);
                    if(s.equals("essential"))
                    {   
                       //System.out.println("essential gift made");
                       
                    }
                    else if(s.equals("luxury"))
                    {   // rating
                        for(int k =0;k < 2;k++)
                     {  n = random.nextInt(50) + 1;
                        s = Integer.toString(n);
                        fileWriter.append(comma);
                        fileWriter.append(s);
                        
                     }
                       // System.out.println("luxury gift made");
                    }
                    else
                    {   for(int k =0;k < 2;k++)
                     {  n = random.nextInt(50) + 1;
                        s = Integer.toString(n);
                        fileWriter.append(comma);
                        fileWriter.append(s);
                        //System.out.println("utility gift made");
                     }
                        
                    }
                    fileWriter.append(System.lineSeparator());
                             
                     
                }
                
          }
        catch (Exception e) { 
                    System.out.println("Error in writing gift.csv !!!"); 
            }
            finally { 
             try { 
                 fileWriter.flush(); 
                 fileWriter.close(); 
             } catch (IOException e) { 
                 System.out.println("exception in inside catch of makegift"); 
             }
            }
    }
}
