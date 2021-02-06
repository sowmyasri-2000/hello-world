import java.rmi.*;
public class MyClient
{
public static void main(String args[])
{
Try
{
Adder stub=(Adder)Naming.lookup("rmi://localhost:5000/IT");
System.out.println(stub.add(35,5));
}
catch(Exception e)
{}
}
} 
