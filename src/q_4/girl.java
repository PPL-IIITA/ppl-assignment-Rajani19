/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_4;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public abstract  class girl {
     private  int beauty;
    private  int maint;
    private  int iq;
    public String name;
    private boy bf;
    private boolean iscommi = false;
     float happy;
    public String type;
    public girl( String name,int beauty,int maint,int iq,String type)
    {   this.name = name;
        this.beauty = beauty;
        this.iq = iq;
        this.maint = maint;
        this.type = type;
        
    }
    public int getb()
    {   return this.beauty;
    }
    public int getmaint()
    {   return this.maint;
    }
    public int getiq()
    {   return this.iq;
    }
    public boy getbf()
    {   return this.bf;
        
     }
     public boolean getiscommi()
    {   return  this.iscommi;
    }
    
    
    public void setbf( boy  bf)
    {    this.bf = bf;
        
     }
    public void  setiscommi( boolean iscommi )
    {     this.iscommi = iscommi;
    }
    public  abstract void  sethappy(  ArrayList<gift> b  );
    
 }
class desperate extends girl{

    public desperate(String name, int beauty, int maint, int iq, String type) {
        super(name, beauty, maint, iq, type);
    }
    /** sets happiness of desperate girls
     * 
     * @param giftlist b 
     */
    public void sethappy( ArrayList<gift> b)
    {   int value = 0;
        Iterator<gift> itr = b.iterator();
        while(itr.hasNext())
        {   gift g = itr.next();
            value += g.price;
         }
         value = Math.abs(this.getmaint() - value);
        happy =  (float) Math.exp(value) % 99999;
       
        
    }
}

class normal extends girl{

    public normal (String name, int beauty, int maint, int iq, String type) {
        super(name, beauty, maint, iq, type);
    }
    /** sets happiness of normal girls
     * 
     * @param giftlist b 
     */
    public void sethappy( ArrayList<gift> b)
    {   int value = 0;
        Iterator<gift> itr = b.iterator();
        while(itr.hasNext())
        {   gift g = itr.next();
            value += g.price;
            value += g.value;
         }
        
       value = Math.abs(this.getmaint() - value);
        happy =  value;
        
    }
}

class choosy  extends girl{

    public choosy (String name, int beauty, int maint, int iq, String type) {
        super(name, beauty, maint, iq, type);
    }
    /** sets happiness of choosy girls
     * 
     * @param giftlist b 
     */
    public void sethappy( ArrayList<gift> b)
    {
        int value = 0;
        Iterator<gift> itr = b.iterator();
        while(itr.hasNext())
        {   gift g = itr.next();
            value += g.price;
            if(g.type.equals("luxury"))
                value += g.price;
         }
        
        value = Math.abs(this.getmaint() - value);
        happy =  (float) Math.log(value) ;
        happy = Math.abs(happy);
        happy = happy % 99999;
    }
}


