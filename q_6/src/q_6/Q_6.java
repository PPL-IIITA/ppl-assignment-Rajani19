/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_6;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Mishra Rajani
 */
public class Q_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Random rand = new Random();
    int  n = (rand.nextInt(50))% 20 + 1;
    writeboy wb = new writeboy();
    writegirl wg = new writegirl();
    wg.makegirl(n);
    wb.makeboy( n + 10);
    readboy rb = new readboy();
    readgirl rg = new readgirl();
    make_couple v = new make_couple();
    //khappy c = new khappy();
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
    {    int t = rand.nextInt(4) + 1;
        for(int j =0;j< t;j++){
            gift_exchange x = new gift_exchange();
            jodia = x.giftx(jodia); // here basket attribute of all cuples are filled with gifts
            //jodia = c.khappy(jodia);
            System.out.println("boy : girl :");
            logger l = new logger();
            l.maklog(jodia);
            jodia = bk.break_form(jodia, b, g,t);
            System.out.println(" break up performed "+ (j + 1)+ "time");
            
        }
    }
    }
    
}
