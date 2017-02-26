/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

/**
 *
 * @author Mishra Rajani
 */
public class girl {
    private  int beauty;
    private  int maint;
    private  int iq;
    public String name;
    private String bf;
    private boolean iscommi = false;
    private int happy;
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
    public String getbf()
    {   return this.bf;
        
     }
     public boolean getiscommi()
    {   return  this.iscommi;
    }
    public int gethappy()
    {   return this.happy;
    }
    
    
    public void setbf( String  bf)
    {    this.bf = bf;
        
     }
    public void  setiscommi( boolean iscommi )
    {     this.iscommi = iscommi;
    }
    public void  sethappy( int happy)
    {   this.happy =  happy;
    }
    
    
    


}
    

