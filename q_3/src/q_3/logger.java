/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q_3;

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
    void maklog( ArrayList<couple> c) throws IOException
    {   Logger logger = Logger.getLogger("MyLog1");  
        FileHandler fh;
        try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("MyLogFile1.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  
        String s = null;
        Iterator<couple> itr = c.iterator();
        while( itr.hasNext())
        {   couple ch = itr.next();
            s = ch.b1.name;
            s = s + " is committed to ";
            s = s + ch.g1.name;
            
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
       FileHandler gh ; Logger logger1 = Logger.getLogger("MyLog2");
       try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("MyLogFile2.log");  
        logger1.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  
        String s = null;
        Iterator<couple> itr = c.iterator();
        while( itr.hasNext())
        {   couple ch = itr.next();
            s = ch.b1.name;
            s = s + " gifted to ";
            s = s + ch.g1.name + " gifts : " + System.lineSeparator();
            Iterator<gift> ll = ch.bucket.iterator();
            while(ll.hasNext())
            {   gift z = ll.next();
                s = s + z.type + " of value = ";
                s = s + z.value + " price  = " + z.price + System.lineSeparator();
                
            }
            
            //System.out.println(s);
            logger1.info(s);
           }
        // the following statement is used to log any messages  
        //logger.info("My first log");
       
        
        

    } catch (SecurityException e) {  
        e.printStackTrace();  
    } catch (IOException e) {  
        e.printStackTrace();  
    }
}
    void maklog2( ArrayList<couple> c) throws IOException
    {   Logger logger = Logger.getLogger("MyLog3");  
        FileHandler fh;
        try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("MyLogFile3.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  
        String s = null;
        
        s = " best k happy couple " + System.lineSeparator();
        logger.info(s);
        int limit = c.size()/5 + 1;
        for(int j =0;j< limit;j++)
        {   couple ch = c.get(j);
            s = ch.b1.name;
            s = s + " is committed to ";
            s = s + ch.g1.name;
            
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
  void maklog3(ArrayList<couple> c) throws IOException
{   Logger logger = Logger.getLogger("MyLog4");  
        FileHandler fh;
        try {  

        // This block configure the logger with handler and formatter  
        fh = new FileHandler("MyLogFile4.log");  
        logger.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();  
        fh.setFormatter(formatter);  
        String s = null;
        
        s = " best k compatible couple " + System.lineSeparator();
        logger.info(s);
        int limit = c.size()/5 + 1;
        for(int j =0;j< limit;j++)
        {   couple ch = c.get(j);
            s = ch.b1.name;
            s = s + " is committed to ";
            s = s + ch.g1.name;
            
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
