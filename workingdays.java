import java.io.*;
import java.util.*;
class workingdays
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
if(s.equals("monday")||s.equals("tuesday")||s.equals("wednesday")||s.equals("thursday")||s.equals("friday")||s.equals("saturday"))
{
  System.out.println("true");
}
else
  System.out.println("false");
}
}