/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mishra Rajani
 */
public class readgift {
    ArrayList<gift> giftlist = new ArrayList<>();
    /** it reads boys info from gift.csv
     * 
     * @return  ArrayList giftlist 
     * @throws IOException 
     */
    public ArrayList<gift> addgifts() throws IOException
    {   String csvfile =  "gift.csv";
        BufferedReader br  = null;
        String line = null ;
        
        Scanner scanner = null;
        br = new BufferedReader(new FileReader(csvfile));
        while ((line = br.readLine()) != null)
        {  scanner = new Scanner(line);
           scanner.useDelimiter(",");
           while (scanner.hasNext()) {
		 gift g;
		int price = Integer.parseInt(scanner.next());
                int value = Integer.parseInt(scanner.next());
                String type = scanner.next();
                if(type.equals("essential"))
                    {   
                     g = new essential (price,value,type);
                       giftlist.add(g);
                    }
                    else if(type.equals("luxury"))
                    {   //rating,diff
                        int rating = Integer.parseInt(scanner.next());
                        int diff = Integer.parseInt(scanner.next());
                        g = new luxury(price,value,type,rating,diff);
                        giftlist.add(g);
                        
                    }
                    else
                    {  // uval,utype
                        int uval = Integer.parseInt(scanner.next());
                        int utype = Integer.parseInt(scanner.next());
                        g = new utility(price,value,type,uval,utype);
                        giftlist.add(g);
                    }
                
			} 
        }
        
        return giftlist;
    }
}
