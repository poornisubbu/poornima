import java.io.*;
import java.util.*;
class factorial
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
 int i=1,fact=1;
 if(n>1)
 {
  for(i=1;i<n;i++)
  {
   fact+=fact*i;
  }
 }
 else
   fact=0;
 System.out.println(fact);
   
}
}