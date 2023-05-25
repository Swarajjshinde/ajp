import java.io.*;
import java.net.*;
public class IntDemo
{
public static void main(String[] args)
{
try
{
InetAddress ip=InetAddress.getByName("localhost");
System.out.println("Host Name."+ip.getHostName());
System.out.println("Host Name."+ip.getHostAddress());
}
catch(Exception e)
{
System.out.println(e);
}
}
}

