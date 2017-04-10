/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class Q_4 {

    /**
     * @param args the command line arguments
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
    int  n = (rand.nextInt(50))% 20 + 1;
    writeboy wb = new writeboy();
    writegirl wg = new writegirl();
    wg.makegirl(n);
    wb.makeboy( n + 10);
    readboy rb = new readboy();
    readgirl rg = new readgirl();
    make_couple v = new make_couple();
    khappy_kcompat c = new khappy_kcompat();
    breakup bk = new breakup();
    ArrayList<girl> g = new ArrayList<>();
    ArrayList<boy> b = new ArrayList<>();
    ArrayList<couple> jodia = new ArrayList<>();
    g = rg.addgirls();
    b = rb.addboys();
    jodia = v.cupid(g,b); // we made couples and stored in list jodia
    if(jodia.isEmpty())
        System.out.println(" input was such that no couples can be  formed");
    else
    {    System.out.println("boy : girl :");
         logger l =  new logger();
         l.maklog(jodia);
        Iterator<couple> i ;
        
        gift_exchange x = new gift_exchange();
        jodia = x.giftx(jodia); // here basket attribute of all cuples are filled with gifts
        jodia = c.khappy(jodia);
        jodia = bk.break_form(jodia, b, g);
        System.out.println(" After performing break up of k couples,boy : girl :");
        l.maklog2(jodia);
    }
    
    
    
    
    
    
    
    
    }
    
}
