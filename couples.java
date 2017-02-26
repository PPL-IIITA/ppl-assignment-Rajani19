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
public class couples {
    private  String bname;
    private  String gname;
    private  int  happy;
    private  int  compat;
    public couples( String bname,String gname,int happy,int compat)
    {   this.bname = bname;
        this.compat = compat;
        this.gname = gname;
        this.happy = happy;
        
        
    }
    public  String getbname()
    {   return this.bname;
        
    }
    public  String getgname()
    {   return this.gname;
        
    }
    public  int gethappy()
    {   return this.happy;
        
    }
    public int getcompat()
    {   return this.compat;
    }
    
        
    
    
    
    
    
}
