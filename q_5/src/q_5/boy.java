/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_5;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public abstract class boy {
    public String name;
    private int attr;
    public int budget;
    private int intg;
    private int minvalue;
    private girl gf;
    private boolean iscommi = false;
   float happy;
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
    public abstract void sethappy(ArrayList<gift> g);
    public abstract ArrayList<gift> findgift( ArrayList<gift> g);

   
            
}
class miser extends boy{

    public miser(String name, int attr, int budget, int intg, int minvalue, String type) {
        super(name, attr, budget, intg, minvalue, type);
    }
    @Override
    /** this function sets happiness of miser boys
     * 
     */
    public void sethappy(ArrayList<gift> g)
    {   int value = 0;
        Iterator<gift> itr = g.iterator();
        while(itr.hasNext())
        {   gift gt = itr.next();
            value += gt.price;
         }
       this.happy = Math.abs(this.budget - value);
        
    } 
    /** this function finds gift  for misers
     * 
     * @param  girllist g
     * @return  giftlist
     */
    public ArrayList<gift> findgift(  ArrayList<gift> g)
    {   ArrayList<gift> bucket = new ArrayList<>();
        Iterator<gift> it = g.iterator();
        int maint = this.getgf().getmaint();
        while(maint >= 0 )
        {   gift gt = it.next();
            
            if( gt.price <= maint)
            {   bucket.add(gt);
                maint -= gt.price;
                
            }
            else
                break;
            
        }
        if(bucket.isEmpty())
            bucket.add(g.get(0));
        return bucket;
        
    }
}
class generous extends boy{

    public generous(String name, int attr, int budget, int intg, int minvalue, String type) {
        super(name, attr, budget, intg, minvalue, type);
    }
    /** this function sets happiness of generous boys
     * 
     */
    public void sethappy(ArrayList<gift> g)
    { happy = this.getgf().happy;
        
    }
    /** this function finds gift  for generous boys
     * 
     * @param  girllist g
     * @return  giftlist
     */
    public ArrayList<gift> findgift(  ArrayList<gift> g)
    {   int i = g.size();
        i -= 1;
        ArrayList<gift> bucket = new ArrayList<>();
        int bud = this.budget;
        while(bud >= 0 )
        {   gift gt = g.get(i);
            if(gt.price <= bud)
            {   bucket.add(gt);
                i -= 1;
                bud -= gt.price;
            }
            else
                break;
         }
        if(bucket.isEmpty())
            bucket.add(g.get(0));
        
        return bucket;
    } 
}


class geeks extends boy{

    public geeks(String name, int attr, int budget, int intg, int minvalue, String type) {
        super(name, attr, budget, intg, minvalue, type);
    }
    /** this function sets happiness of geek boys
     * 
     */
    public void sethappy(ArrayList<gift> g)
    {
       happy = this.getgf().getiq();
    } 
    /** this function finds gift for geeks
     * 
     * @param  girllist g
     * @return  giftlist
     */
    public ArrayList<gift> findgift(  ArrayList<gift> g)
    {   ArrayList<gift> bucket = new ArrayList<>();
        Iterator<gift> it = g.iterator();
        int maint = this.getgf().getmaint();
        while(maint >= 0 )
        {   gift gt = it.next();
            
            if( gt.price <= maint)
            {   bucket.add(gt);
                maint -= gt.price;
                
            }
            else
                break;
            
        }
        if( (this.budget - this.getgf().getmaint() ) > 0 )
        {    it = g.iterator();
            while(it.hasNext())
            {    gift gt = it.next();
                if( gt.price <= (this.budget - this.getgf().getmaint() ) && gt.type.equals("luxury"))
                {   bucket.add(gt);
                    break;
                }
             }
            
        }
        if(bucket.isEmpty())
            bucket.add(g.get(0));
        return bucket;
        
    } 
}