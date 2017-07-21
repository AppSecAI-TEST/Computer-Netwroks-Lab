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
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
