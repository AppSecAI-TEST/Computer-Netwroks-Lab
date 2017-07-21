package rahul;

import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
public class Assignment1 
{
    public static void main(String args[])throws IOException
    {
        try
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String localhn = InetAddress.getLocalHost().getHostName();
            String localadd = InetAddress.getLocalHost().getHostAddress();
            System.out.println("Enter ip address to return hostname");
            String ip = br.readLine();
            InetAddress obj1 =InetAddress.getByName(ip);
            System.out.println("Enter hostname to return ip address");
            String hn = br.readLine();
            InetAddress obj2 =InetAddress.getByName(hn);
            System.out.println("Local host name : "+localhn);
            System.out.println("Local host address : "+localadd);
            System.out.println("Remote host name : "+obj1.getHostName());
            System.out.println("Remote host address : "+obj2.getHostAddress());
            InetAddress obj3 =InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(obj3);
            byte[] bytes = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) 
            {
                sb.append(String.format("%02X%s", bytes[i], (i < bytes.length - 1) ? "-" : ""));
            }
            String mac = sb.toString();
            System.out.println("MAC Address : "+mac);
            
            System.out.println("Enter ip address");
            ip = br.readLine();
            String st="";
            for(int i=0;i<ip.length()&&ip.charAt(i)!='.';i++)
            {
                st=st+ip.charAt(i);
            }
            int x = Integer.parseInt(st);
            if(x>=1&&x<=126)
                System.out.println("Class A");
            else if(x>=128&&x<=191)
                System.out.println("Class B");
            else if(x>=192&&x<=223)
                System.out.println("Class C");
            else if(x>=224&&x<=239)
                System.out.println("Class D");
            else if(x>=240&&x<=254)
                System.out.println("Class E");
            else
                System.out.println("No class found");
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
