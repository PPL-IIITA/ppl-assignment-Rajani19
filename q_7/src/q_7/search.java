/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author Mishra Rajani
 */
public class search {
    ArrayList<girl> g = new ArrayList<>();
    ArrayList<couple> c;
    ArrayList<boy> b;
    search(ArrayList<couple> c,ArrayList<boy> b)
    {   this.b = b;
        this.c = c;
        
    }
    
    
    
}
class brute_force extends search
{
    
    public brute_force(ArrayList<couple> c, ArrayList<boy> b) {
        super(c, b);
    }
    /** this function searchs in the brute force way
     * 
     * @return ArrayList<girl> g 
     */
    ArrayList<girl> find( )
    {   int end =  b.size();
        Iterator<couple> i;
        for(int j =0;j< end;j++)
        {   i = c.iterator();
            int count = 0; 
            girl g1;
            boy b1 = b.get(j);
           while(i.hasNext())
            {   couple c1 =  i.next();
                if(c1.b1.name.equals(b1.name))
                {   g1 = b.get(j).getgf();
                    g.add(g1);
                    count = 1;
                    break;
                }
             }
           if(count == 0)
           {
               g1 = new girl("-1",-1,-1,-1,"-1");
               g.add(g1);
           }
        }
        return g;
    }
}
class binary_search extends search {
    
    

    public binary_search(ArrayList<couple> c, ArrayList<boy> b) {
        super(c, b);
        // sort(c);
     }
    /** sorts the couples list as per boys  name
     * 
     */ 
     void sort()
    {   for(int i=0; i<c.size()-1; i++) { 
            for(int j=i+1; j<c.size(); j++) { 
                if(c.get(i).b1.name.compareTo(c.get(j).b1.name) > 0) 
                    Collections.swap(c, i, j);
              }
    }
    }
    /** searches for girlfriends using binary search logic
     * 
     * @return ArrayList<girl> g
     * 
     */
    ArrayList<girl> find()
    {  sort();
        for(int i = 0;i < b.size() ;i++ )
        {   girl g1 ;
            int index = bsearch(b.get(i).name,0,c.size());
            if(index != -1)
            {   g1 = c.get(index).g1;
                g.add(g1);
                
            }
            else
            {   g1 = new girl("-1",-1,-1,-1,"-1");
                 g.add(g1);
                
            }
        
        }
        return g;
        
    }
    /** binary search function helps find function to find the girlfriend
     * 
     * @param  String name
     * @param  int left
     * @param  int right
     * @return 
     */

     int  bsearch(String name , int left,int right) {
         if(right <= left)
             return -1;
         int mid = (left + right)/ 2;
         if(name.compareTo(c.get(mid).b1.name) < 0)
             return bsearch( name,0,mid);
         else if(name.compareTo(c.get(mid).b1.name) > 0)
             return bsearch(name,mid +1,right);
         else
             return mid;
             
              
        
    }
 }
class hash extends search{
    
    public hash(ArrayList<couple> c, ArrayList<boy> b) {
        super(c, b);
    }
    /** searches for girlfriends using hashing
     * 
     * @return  ArrayList<girl> g
     */
    ArrayList<girl> find( )
    {   int end =  b.size();
        Iterator<couple> i;
        for(int j =0;j< end;j++)
        {   i = c.iterator();
            int count = 0; 
            girl g1;
            boy b1 = b.get(j);
           while(i.hasNext())
            {   couple c1 =  i.next();
                if(c1.b1.name.equals(b1.name))
                {   g1 = b.get(j).getgf();
                    g.add(g1);
                    count = 1;
                    break;
                }
             }
           if(count == 0)
           {
               g1 = new girl("-1",-1,-1,-1,"-1");
               g.add(g1);
           }
        }
        return g;
    }
    
}





