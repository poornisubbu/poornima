import java.io.*;
import java.util.*;
class smallelement
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int[] a=new int[n];
int i;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(i=0;i<a.length;i++)
{
 System.out.print(a[i]+" ");
}
System.out.println("second smallest element:"+a[1]);
}
}