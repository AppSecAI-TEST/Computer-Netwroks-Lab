/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rahul;

/**
 *
 * @author bit
 */
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
public class Assignment3 
{
   public static void main(String args[])
    {
        try
        {
           InetAddress ip = InetAddress.getLocalHost();
           Socket s = new Socket(ip,135);
           System.out.println("Local Port Number : "+s.getLocalPort());
           s.close();
           for(int i = 1;i<=1023;i++)
           {
               try{
               Socket obj = new Socket(ip,i);
               System.out.println("Connected at : "+i);
               }
               catch(Exception e)
               {
                   System.out.println("Not listening at : "+i);
               }
           }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    } 
}
