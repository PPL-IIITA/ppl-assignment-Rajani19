/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Mishra Rajani
 */
public class Q_7 {

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
    makecouple v = new makecouple();
    //khappy_kcompat c = new khappy_kcompat();
    ArrayList<girl> g = new ArrayList<>();
    ArrayList<girl> info = new ArrayList<>();
    ArrayList<boy> b = new ArrayList<>();
    ArrayList<couple> jodia = new ArrayList<>();
    g = rg.addgirls();
    b = rb.addboys();
    jodia = v.cupid(g,b); // we made couples and stored in list jodia
    if(jodia.isEmpty())
        System.out.println(" input was such that no couples can be  formed");
    
    
    
    int choice = rand.nextInt(3) % 2 + 1;
    if(choice == 1 )
    {   brute_force bz = new brute_force(jodia,b);
        info = bz.find();
    }
    else
    {   binary_search bz = new binary_search(jodia,b); 
         info = bz.find();
         logger l = new logger();
         l.maklog(b, info);
    }
    
    
    }
    
}
