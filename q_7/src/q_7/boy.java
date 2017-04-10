/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_7;

/**
 *
 * @author Mishra Rajani
 */
public class boy {
    public String name;
    private int attr;
    public int budget;
    private int intg;
    private int minvalue;
    private girl gf = null;
    private boolean iscommi = false;
    public String type;
    public boy( String name, int attr,int budget,int intg,int minvalue,String type)
    {   this.name = name;
        this.attr = attr;
        this.budget = budget;
        this.intg = intg;
        this.minvalue = minvalue;
        this.type = type;
        
    }
    public int getattr()
    {
        return this.attr;
    }        
    public int getbudgat()
    {
        return this.budget;
    }        
    public int getintg()
    {
        return this.intg;
    }
    public int getminvalue()
    {
        return this.minvalue;
    }
    public girl getgf()
    {
        return this.gf;
    }        
    public boolean getiscommi()
    {
        return this.iscommi;
    }
    
    public void setgf( girl  gf)
    {    this.gf = gf;
        
     }
    public void  setiscommi( boolean iscommi )
    {     this.iscommi = iscommi;
    }
    
      
}
