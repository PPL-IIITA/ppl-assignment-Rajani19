/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *        pat;
    public couples( String bname,String gname,int happy,int compat)
 * @author Mishra Rajani
 */
public class makejodi {
    ArrayList<couples> cupid( ArrayList<girl> g,ArrayList<boy> b)
    {  Iterator<girl> itr1 = g.iterator();
        Iterator<boy> itr2 = b.iterator();
        ArrayList<couples> c = new ArrayList<>();
        while(itr1.hasNext()){
            girl g1 = itr1.next();
            String gname = g1.name; 
            int maint =  g1.getmaint();
            int beauty = g1.getb();
            while(itr2.hasNext())
            {   boy b1 = itr2.next();
                int budget = b1.budget;
                int need = b1.getminvalue();
               boolean com = b1.getiscommi();
               String bname = b1.name;
               if(maint >= budget && beauty >= need && !com )
               {    g1.setbf( bname);
                    b1.setgf(gname);
                    b1.setiscommi(true);
                    g1.setiscommi(true);
                    couples temp = new couples(bname,gname,0,0);
                    c.add(temp);
                }
            }
            
        }

        
    return c;    
    }
            //ArrayList<Integer> array
}
