/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public class make_couple2 {
    /** it makes couples as per logic 2
     * 
     * @param  ArrayList<girl>g
     * @param  ArrayList<boy>b
     * @return 
     */
    ArrayList<couple> cupid( ArrayList<girl> g,ArrayList<boy> b)
    {   Collections.sort(g, (girl g1, girl g2) -> {
        //return g1.happiness - g2.hagppiness;
        if(g1.getmaint() > g2.getmaint())
            return 1;
        else if(g1.getmaint() < g2.getmaint())
            return -1;
        else
            return 0;
    });
        Collections.sort(b, (boy b1, boy b2) -> {
            //return g1.happiness - g2.hagppiness;
            if(b1.getminvalue() > b2.getminvalue())
                return 1;
            else if(b1.getminvalue() < b2.getminvalue())
                return -1;
            else
                return 0;
    });
      ArrayList<couple> c = new ArrayList<> ();
      boy bf = null;
      girl gf = null;
      int indg = 0,indb=0,count = 0;
      while( count < (g.size() + b.size()))
      { if(count%2 == 0 && indg < g.size())
        {   
            Iterator<boy> itrb = b.iterator();
            girl g1 = g.get(indg); 
            boy b1;
            int maint =  g1.getmaint();
            int beauty = g1.getb();
            while(itrb.hasNext())
                {    b1 = itrb.next();
                    int budget = b1.budget;
                    int need = b1.getminvalue();
                    if(maint <= budget && beauty >= need && !b1.getiscommi() && !g1.getiscommi() )
                    {    bf = b1;
                        break;
                    }
                }
            g1.setbf(bf);
            g1.setiscommi(true);
            bf.setgf(g1);
            bf.setiscommi(true);
            couple temp = new couple(g1,bf,0,0);
            c.add(temp);
            count += 1;
            indg += 1;
        }
      else if( count %2 == 0 && indg >= g.size())
          count += 1;
      else if( count%2 != 0 && indb < b.size())
      {   Iterator<girl> itrg = g.iterator();
            boy b1 = b.get(indb);
            girl g1;
            int budget = b1.budget;
            int need = b1.getminvalue();
            while(itrg.hasNext())
                {    g1 = itrg.next();
                    int maint =  g1.getmaint();
                    int beauty = g1.getb();
                    
                    if(maint <= budget && beauty >= need && !g1.getiscommi() )
                    {   if(gf == null)
                            gf = g1;
                        else if(gf.getb() < g1.getb())
                           gf = g1;}}
            b1.setgf(gf);
            b1.setiscommi(true);
            gf.setbf(b1);
            gf.setiscommi(true);
            couple temp = new couple(gf,b1,0,0);
            c.add(temp);
            indb += 1;
            count += 1;
          
      }
      else if ( indb >= b.size())
          break;
          
      
          
    }
      
      
        
        return c;
            
    }

    
}
