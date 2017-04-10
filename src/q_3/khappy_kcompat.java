/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public class khappy_kcompat {
 /** sorts the couplelist as per happiness
  * 
  * @param couplelist c
  * @return couplelist c
  */
    ArrayList<couple> khappy(ArrayList<couple> c)
    {   ArrayList<couple> kh = c;
         Collections.sort(kh,new Comparator <couple>()
         {
            public int  compare(couple g1,couple g2)
            {   //return g1.happiness - g2.hagppiness;
                if(g1.happiness > g2.happiness)
                    return 1;
                else if(g1.happiness < g2.happiness)
                    return -1;
                else 
                    return 0;
            }
        });
      return kh;
        }
    /** sorts the couplelist as per compatibility
  * 
  * @param couplelist c
  * @return 
  */
    ArrayList<couple> kcomp(ArrayList<couple> c)
    {   
        ArrayList<couple> kh = c;
         Collections.sort(kh,new Comparator <couple>()
         {
            public int  compare(couple g1,couple g2)
            {   //return g1.happiness - g2.hagppiness;
                if(g1.compatibility > g2.compatibility)
                    return 1;
                else if(g1.compatibility < g2.compatibility)
                    return -1;
                else 
                    return 0;
            }
        });
      return kh;
    }
   
}
