import java.io.*;
import java.util.*;
class unique1
{
public static void main(String args[])
{
 Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
int a[]=new int[n];
 for(int i=0;i<n;i++)
{
 a[i]=sc.nextInt();
}
Arrays.sort(a);
unique1 ar=new unique1();
ar.unique(a);
}
public void unique(int b[])
{
 for(int i=0;i<b.length;i++)
{
 if(b[i]==i)
 {
   System.out.println("the number"+b[i]+"equals its index"+i);
   break;
  }
 }
}
}