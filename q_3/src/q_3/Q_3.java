/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class Q_3 {

    /**
     * @param args the command line arguments
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
    makecouple v = new makecouple();
    khappy_kcompat c = new khappy_kcompat();
    ArrayList<girl> g = new ArrayList<>();
    ArrayList<boy> b = new ArrayList<>();
    ArrayList<couple> jodia = new ArrayList<>();
    g = rg.addgirls();
    b = rb.addboys();
    jodia = v.cupid(g,b); // we made couples and stored in list jodia
    if(jodia.isEmpty())
        System.out.println(" input was such that no couples can be  formed");
    else
    {   System.out.println("no of couples " + jodia.size());
        gift_exchange x = new gift_exchange();
        jodia = x.giftx(jodia);// here basket attribute of all cuples are filled with gifts
        logger l =  new logger();
        l.maklog(jodia);
         jodia = c.khappy(jodia);
        l.maklog2(jodia);
        jodia = c.kcomp(jodia);
        l.maklog3(jodia);
    }
       
    
    
    
    
          
         
         }
    }
    

