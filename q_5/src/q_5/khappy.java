/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Mishra Rajani
 */
public class khappy {
    /**it sorts the coulelist as per happiness and returns it
     * 
     * @param  ArrayList<couple> c
     * @return 
     */
    ArrayList<couple> khappy(ArrayList<couple> c)
    {   for(int i=0; i<c.size()-1; i++) { 
            for(int j=i+1; j<c.size(); j++) { 
                if( c.get(i).happiness  <  c.get(j).happiness ) 
                    Collections.swap(c, i, j);
              }
    }
      return c;
        }
}
