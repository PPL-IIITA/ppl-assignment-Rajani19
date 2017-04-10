/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public class make_couple1 {
    /** it makes couples as per logic 1
     * 
     * @param  ArrayList<girl>g
     * @param   ArrayList<boy> b
     * @return ArrayList<couple> c
     */ 
    ArrayList<couple> cupid( ArrayList<girl> g,ArrayList<boy> b)
    {  
        Iterator<girl> itr1 = g.iterator();
        Iterator<boy> itr2 = b.iterator();
        ArrayList<couple> c = new ArrayList<>();
        while(itr1.hasNext()){
            girl g1 = itr1.next(); boy b1;
            
            int maint =  g1.getmaint();
            int beauty = g1.getb();
            while(itr2.hasNext())
            {    b1 = itr2.next();
                int budget = b1.budget;
                int need = b1.getminvalue();
               boolean com = b1.getiscommi();
               
               if(maint <= budget && beauty >= need && !com )
               {    g1.setbf( b1);
                    b1.setgf(g1);
                    b1.setiscommi(true);
                    g1.setiscommi(true);
                    couple temp = new couple(g1,b1,0,0);
                    c.add(temp);
                    break;
                }
            }
        }
        return c;
            
    }
}
