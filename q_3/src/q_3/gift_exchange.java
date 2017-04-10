/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class gift_exchange {
   /** this function fills the gift basket of all couples
    * 
    * @param  couplelist jodia
    * @return couplelist jodia with gift basket filled
    * @throws IOException 
    */
    ArrayList<couple> giftx( ArrayList<couple> jodia) throws IOException
     {  Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        n = n%10; n += 10;
        writegift g = new writegift();
        g.makegift(n);
        readgift rgt = new readgift();
        ArrayList<gift> giftlist = new ArrayList<>();
        giftlist = rgt.addgifts();
         Collections.sort(giftlist,new Comparator <gift>()
         {@Override
            public int compare(gift g1,gift g2)
            {   return g1.price - g2.price;
             
            }
             
         });
          Iterator<couple> itr = jodia.iterator();
         while(itr.hasNext())
         {  couple c = itr.next();
            c.bucket = c.b1.findgift(giftlist);
         }
         itr = jodia.iterator();
         while(itr.hasNext())
         {  couple c = itr.next();
            c.set(c);
             
         }
         //System.out.println("return gifts");
        return jodia;
         
         
     }
 
}
