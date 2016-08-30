import java.io.*;
import java.util.*;
class primefactors
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i;
int count=0;
for(i=2;i<=n;i++)
{
 int flag=0;
for(int j=2;j<i;j++)
{
if(i%j==0)
{
 flag=1;
}
}
if(flag==0)
 count++;
}
System.out.println(count);
}
}