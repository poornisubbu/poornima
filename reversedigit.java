import java.io.*;
import java.util.*;
class reversedigit
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 int  n=sc.nextInt();
int rev=0,a;
 while(n!=0)
 {
  rev=rev*10;
a=n%10;
rev=rev+a;
n=n/10;
}
System.out.println(rev);
}
}
 