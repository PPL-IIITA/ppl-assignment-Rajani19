/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class i_make_ip {
    private static final String comma = ","; 
    

    void makegirl(int size) throws IOException
    {   
        
        
        FileWriter fwOb = new FileWriter("girl.csv", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
        
        String s,output;
        int n;
       // this will make girl.csv
       // format is = name,beauty,maintance,iq,type
        String[] type = new String[]{"choosy", "normal", "desperate"}; 
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
       // StringBuilder sb = new StringBuilder();
        Random random = new Random(); 
        FileWriter fileWriter = null;  
        try{
            fileWriter = new FileWriter("girl.csv", true);
            
            for(int i =0;i<size;i++)
                {   StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < 5; j++) {
                        char c = chars[random.nextInt(chars.length)];
                        sb.append(c);
                     }
                     output = sb.toString();
                     
                     fileWriter.append(output); 
                     fileWriter.append(comma); 
                     //System.out.println("adding   "  + output + "  to girl.csv");
                     for(int k =0;k < 3;k++)
                     {  n = random.nextInt(50) + 1;
                        s = Integer.toString(n);
                       // System.out.println("adding "  + s + "to girl.csv");
                        fileWriter.append(s);
                        fileWriter.append(comma); // adding beauty,maintance,iq
                     }
                     n = random.nextInt(10) + 1;
                     n = n%3;
                     s = type[n];
                     //System.out.println("adding "  + s + "to girl.csv");
                     fileWriter.append(s);
                     fileWriter.append(System.lineSeparator());}
                
          }
            catch (Exception e) { 
                    System.out.println("Error in writing girl.csv !!!"); 
            }
            finally { 
             try { 
                 fileWriter.flush(); 
                 fileWriter.close(); 
             } catch (IOException e) { 
                 System.out.println("exception in inside catch of makegirls"); 
             }
            }
    }
    void makeboy(int size) throws IOException
    {
        FileWriter fwOb = new FileWriter("boy.csv", false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
        
        String s,output;
        int n;
       // this will make boy.csv
       // format is = name,attractivenes,budget,intelligence,minvalue,type
        String[] type = new String[]{"miser", "generous", "geeks"}; 
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray(); 
       // StringBuilder sb = new StringBuilder();
        Random random = new Random(); 
        FileWriter fileWriter = null; 
        try{
            fileWriter = new FileWriter("boy.csv", true);
            for(int i =0;i<size;i++)
                {   StringBuilder sb = new StringBuilder();
                    for (int j = 0; j < 5; j++) {
                        char c = chars[random.nextInt(chars.length)];
                        sb.append(c);
                     }
                     output = sb.toString();
                     
                     fileWriter.append(output); 
                     fileWriter.append(comma); 
                     //System.out.println("adding   "  + output + "  to boy.csv");
                     for(int k =0;k < 4;k++)
                     {  n = random.nextInt(50) + 1;
                        s = Integer.toString(n);
                        //System.out.println("adding "  + s + "to boy.csv");
                        fileWriter.append(s);
                        fileWriter.append(comma); // adding attractiveness,budget,intelligence,minvalue
                     }
                     n = random.nextInt(10) + 1;
                     n = n%3;
                     s = type[n];
                    fileWriter.append(s);
                    fileWriter.append(System.lineSeparator());
                             
                     
                }
                
          }
            catch (Exception e) { 
                    System.out.println("Error in writing boy.csv !!!"); 
            }
            finally { 
             try { 
                 fileWriter.flush(); 
                 fileWriter.close(); 
             } catch (IOException e) { 
                 System.out.println("exception in inside catch of makeboys"); 
             }
            }
        
        
        
        
    }
    
        
        
        
       
}

