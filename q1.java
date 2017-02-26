/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class q1 {

  
    
    public static void main(String[] args) throws IOException { 
            
          Random rand = new Random();
          int  n = rand.nextInt(50) + 1;
          n = n%20; n += 1;
         i_make_ip i = new i_make_ip();
         i.makegirl(n);
         i.makeboy(n+5 );
          
          
         ArrayList<girl> girllist = new ArrayList<>();
          ArrayList<boy> boylist = new ArrayList<>();
          ArrayList<couples> jodia = new ArrayList<>();
          read r = new read();
          makejodi j = new  makejodi();
          girllist = r.addgirls();
          boylist= r.addboys();
          
         jodia =  j.cupid(girllist, boylist);
         Iterator<couples> itr = jodia.iterator();
         if(!itr.hasNext())
             System.out.println(" input was such that no couples can be  formed");
         /*while(itr.hasNext())
         {  couples c = itr.next();
             System.out.println("bf is " + c.getbname() +  " gf is " + c.getgname() );
             
         }
        */
         logger l =  new logger();
         l.maklog(jodia);
               
          


          
          
         
          
        
    
    }  
}
