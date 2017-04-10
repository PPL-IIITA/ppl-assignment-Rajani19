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
public class readboy {
    ArrayList<boy> boylist = new ArrayList<>();
    /** it reads boys info from boy.csv
     * 
     * @return  ArrayList boylist 
     * @throws IOException 
     */
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
		String name = scanner.next(); boy b;
		int attr = Integer.parseInt(scanner.next());
                int budget = Integer.parseInt(scanner.next());
                int intg = Integer.parseInt(scanner.next());
                 int minvalue = Integer.parseInt(scanner.next());
                 String type = scanner.next();
                if(type.equals("miser"))
                    b = new miser(name,attr,budget,intg,minvalue,type);
                else if(type.equals("generous"))
                    b = new generous(name,attr,budget,intg,minvalue,type);
                else
                b = new geeks(name,attr,budget,intg,minvalue,type);
                boylist.add(b);
			} 
        }
        //System.out.println("return boys");
        return boylist;
    }
    
}
