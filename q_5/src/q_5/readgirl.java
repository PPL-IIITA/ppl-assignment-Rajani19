/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mishra Rajani
 */
public class readgirl {
 ArrayList<girl> girllist = new ArrayList<>();
    
    public ArrayList<girl> addgirls() throws IOException
    {   String csvfile =  "girl.csv";
        BufferedReader br  = null;
        String line = null ;
        // String name,int beauty,int maint,int iq
        Scanner scanner = null;
        br = new BufferedReader(new FileReader(csvfile));
        while ((line = br.readLine()) != null)
        {  scanner = new Scanner(line);
           scanner.useDelimiter(",");
           while (scanner.hasNext()) {
		String name = scanner.next(); girl g;
		int b = Integer.parseInt(scanner.next());
                int maint = Integer.parseInt(scanner.next());
                int iq = Integer.parseInt(scanner.next());
                String type = scanner.next();
                if(type.equals("choosy"))
                {   g = new choosy(name,b,maint,iq,type);  }
                else if(type.equals("normal"))
                    g = new normal(name,b,maint,iq,type);
                else
                  g = new desperate(name,b,maint,iq,type);
                girllist.add(g);
			} 
               }
      // System.out.println("return girls");
         return girllist;
     }   
}
