/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_7;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public class girl {
    private  int beauty;
    private  int maint;
    private  int iq;
    public String name;
    private boy bf = null;
    private boolean iscommi = false;
     
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
    


}
    