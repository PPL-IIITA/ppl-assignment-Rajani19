/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mishra Rajani
 */
public class Q_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    Random rand = new Random();
    Scanner sc = new Scanner(System.in); 
    int choice;
    writeboy wb = new writeboy();
    writegirl wg = new writegirl();
    wg.makegirl( 50);
    wb.makeboy( 70);
    readboy rb = new readboy();
    readgirl rg = new readgirl();
    khappy kh = new khappy();
    ArrayList<girl> g = new ArrayList<>();
    ArrayList<boy> b = new ArrayList<>();
    ArrayList<couple> jodia = new ArrayList<>();
    g = rg.addgirls();
    b = rb.addboys();
    //System.out.println("enter 1 for implementation 1 and 2 for implementation 2");
    //choice = sc.nextInt();
    
    choice = rand.nextInt(3);
    choice = choice%2 + 1;
    
    
    if(choice == 1 )
    {   make_couple1 v =  new make_couple1();
        jodia = v.cupid(g, b);
    }
    else
    {   make_couple2 v = new make_couple2();
        jodia = v.cupid(g, b);
        
    }
    if(jodia.isEmpty())
        System.out.println(" input was such that no couples can be  formed");
    else
    {   System.out.println("boy : girl :");
        Iterator<couple> i ;
        gift_exchange x = new gift_exchange();
        jodia = x.giftx(jodia);// here basket attribute of all cuples are filled with gifts
        jodia = kh.khappy(jodia);
        logger l = new logger();
        l.maklog(jodia);
    
        }
    }
    
}
