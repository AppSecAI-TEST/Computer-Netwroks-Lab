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
import java.net.MalformedURLException;
import java.net.URL;
public class Assignment2 
{
    public static void main(String args[])
    {
        try{
        URL obj = new URL("https://172.16.1.1:8090/httpclient.html?u=http://go.microsoft.com/fwlink/?LinkId=299201");
        System.out.println("Authority : "+obj.getAuthority());
        //System.out.println("Content : "+obj.getContent());
        System.out.println("Default Port : "+obj.getDefaultPort());
        System.out.println("File Name : "+obj.getFile());
        System.out.println("Host : "+obj.getHost());
        System.out.println("Path : "+obj.getPath());
        System.out.println("Port : "+obj.getPort());
        System.out.println("Protocol : "+obj.getProtocol());
        System.out.println("Query : "+obj.getQuery());
        System.out.println("Reference :"+obj.getRef());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
