import java.io.*;
import java.util.*;
class unique
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
StringBuffer sb=new StringBuffer();
for(int i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<a.length;i++)
{
sb.append(a[i]);
}
String s=sb.toString();
for(int i=0;i<sb.length();i++)
{
int b=(int)s.charAt(i);
if(s.indexOf(b)==s.lastIndexOf(b))
{
System.out.println(s.charAt(i));
break;
}
}
}
}
