/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

public class boy {
    public String name;
    private int attr;
    public int budget;
    private int intg;
    private int minvalue;
    private String gf;
    private boolean iscommi = false;
    private int happy;
    public String type;
    public boy( String name, int attr,int budget,int intg,int minvalue,String type)
    {   this.name = name;
        this.attr = attr;
        this.budget = budget;
        this.intg = intg;
        this.minvalue = minvalue;
        this.type = type;
        
    }
    private int getattr()
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
    public String getgf()
    {
        return this.gf;
    }        
    public boolean getiscommi()
    {
        return this.iscommi;
    }
    public int gethappy()
    {
        return this.happy;
    }
    public void setgf( String  gf)
    {    this.gf = gf;
        
     }
    public void  setiscommi( boolean iscommi )
    {     this.iscommi = iscommi;
    }
    public void  sethappy( int happy)
    {   this.happy =  happy;
    }
}     
