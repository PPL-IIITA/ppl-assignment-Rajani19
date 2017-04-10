/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_6;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public class breakup {
    /** it performs the berkup of   happy couples with happiness less than t
     * 
     * @param  ArrayList<couple> c c
     * @param ArrayList<boy>  b
     * @param ArrayList<girl>  g
     * @return 
     */
    ArrayList<couple> break_form( ArrayList<couple> c ,ArrayList<boy> b,ArrayList<girl> g,int t)
   {   if(c.size() == 0)
       return c;
       Iterator<boy> bitr;
      // Iterator<couple> i = c.iterator();
       for(int i = 0;i< c.size();i++)
       {    couple c1 = c.get(i);
            if(c1.happiness < 50)
            {   bitr = b.iterator();
                int flag = 0;
                while(bitr.hasNext())
                {   boy b1 = bitr.next();
                    if(c1.g1.getmaint() <= b1.budget && c1.g1.getb() >= b1.getminvalue() && !b1.getiscommi() && !b1.name.equals(c1.b1.name))
                    {   c1.g1.setbf( b1);
                        b1.setgf(c1.g1);
                        b1.setiscommi(true);
                        c1.b1.setgf(null);
                        c1.b1.setiscommi(false);
                        c1.b1 =b1;
                        c1.bucket = null; c1.happiness = 0;c1.compatibility = 0;
                        flag = 1;
                    break; }
                }
                if(flag == 0)
                {   c1.bucket = null; c1.happiness = 0;c1.compatibility = 0;
                    c.remove(i);
                }
             }
           
       }
       
       
       
    return c;   
   }
}
