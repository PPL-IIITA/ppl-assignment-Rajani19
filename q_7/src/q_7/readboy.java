/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Mishra Rajani
 */
public class readboy {
    ArrayList<boy> boylist = new ArrayList<>();
    
        //System.out.println("return boys");
      
    public ArrayList<boy> addboys() throws IOException
    {   String csvfile =  "boy.csv";
        BufferedReader br  = null;
        String line = null ;
        // String name, int attr,int budget,int intg,int minvalue
        Scanner scanner = null;
        br = new BufferedReader(new FileReader(csvfile));
        while ((line = br.readLine()) != null)
        {  scanner = new Scanner(line);
           scanner.useDelimiter(",");
           while (scanner.hasNext()) {
		String name = scanner.next();
		int attr = Integer.parseInt(scanner.next());
                int budget = Integer.parseInt(scanner.next());
                int intg = Integer.parseInt(scanner.next());
                 int minvalue = Integer.parseInt(scanner.next());
                 String type = scanner.next();
                //System.out.println("name is" + name + "beauty is" + b );
                boy b = new boy(name,attr,budget,intg,minvalue,type);
                boylist.add(b);
			} 
        }
        //System.out.println("return boys");
        return boylist;
    }
}
