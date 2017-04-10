/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class breakup {
    /** it performs the berkup of  k least happy couples
     * 
     * @param  ArrayList<couple> c c
     * @param ArrayList<boy>  b
     * @param ArrayList<girl>  g
     * @return 
     */
    ArrayList<couple> break_form( ArrayList<couple> c ,ArrayList<boy> b,ArrayList<girl> g)
   {   if(c.size() == 0)
       return c;
       Iterator<boy> bitr;
       int k = 10 % c.size() + 1;
       System.out.println(" k is " + k);
       for(int i =0;i<k;i++)
        {   couple temp = c.get(i);
            bitr = b.iterator();
            int flag = 0;
            while(bitr.hasNext())
            {   boy b1 = bitr.next();
                if(temp.g1.getmaint() <= b1.budget && temp.g1.getb() >= b1.getminvalue() && !b1.getiscommi() && !b1.name.equals(temp.b1.name))
                {   temp.g1.setbf( b1);
                    b1.setgf(temp.g1);
                    b1.setiscommi(true);
                    temp.b1.setgf(null);
                    temp.b1.setiscommi(false);
                    temp.b1 =b1;
                    flag = 1;
                    break; }
            }
            if(flag == 0)
            {   
                c.remove(i);
            }
       }
    return c;   
   }
}
