/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_7;

/**
 *
 * @author Mishra Rajani
 */
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Mishra Rajani
 */
public class logger {
    void maklog( ArrayList<boy> b, ArrayList<girl> g) throws IOException
    {   Logger logger = Logger.getLogger("MyLog");  
        FileHandler fh;
        try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("find_gf.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  
        String s = null;
        //s = " best k happy couple " + System.lineSeparator();
        //logger.info(s);
        
        for(int j =0;j< b.size();j++)
        {   boy b1 = b.get(j);
            girl g1 = g.get(j);
            s = b1.name;
            if(g1.name.equals("-1"))
                s = s + " has no girlfriend ";
            else
                s = s + " girlfriend is " + g1.name;
            
            //System.out.println(s);
            logger.info(s);
           }

        // the following statement is used to log any messages  
        //logger.info("My first log");  

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }  
        
        

        
   }
}
    

