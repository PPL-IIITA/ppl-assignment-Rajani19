/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_4;

import java.util.ArrayList;

/**
 *
 * @author Mishra Rajani
 */
public class couple {
    girl g1 ;boy b1;
    float happiness;
    int compatibility;
    ArrayList<gift> bucket;
    couple( girl g1,boy b1,int happiness,int comp)
    {
        this.b1= b1;
        this.g1 = g1;
        this.compatibility = comp;
        this.happiness = happiness;
        
    }
    void set( couple ch)
    {     
        
          //couple ch = itr.next();
            ch.g1.sethappy(ch.bucket);
            ch.b1.sethappy(ch.bucket);
            ch.happiness = ch.b1.happy + ch.g1.happy;
            ch.compatibility = (ch.b1.budget - ch.g1.getmaint()) + Math.abs(ch.b1.getintg() - ch.g1.getiq()) + Math.abs(ch.b1.getattr() - ch.g1.getb());
          // this sets the happiness n compatibility of the co   
        
    }
    
}
