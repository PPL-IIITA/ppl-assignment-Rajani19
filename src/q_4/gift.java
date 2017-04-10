/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_4;

/**
 *
 * @author Mishra Rajani
 */
public abstract class gift   {
    int price;
    int value;
    String type;
    gift(int price,int value,String type)
    {   this.price = price;
        this.value = value;
        this.type = type;
        
    }
    
}
class essential extends gift{

    public essential(int price, int value, String type) {
        super(price, value, type);
    }

    
    
    
}
class luxury extends gift
{   int rating;
    int diff;

    public luxury(int price, int value,String type ,int rating,int diff) {
        super(price, value,type);
        this.diff = diff;
        this.rating = rating;
    }
 }
class utility extends gift
{   int utility_value;
    int utility_type;

    public utility(int price, int value,String type ,int uval,int utype) {
        super(price, value,type);
        this.utility_type = utype;
        this.utility_value = uval;
    }
 }

