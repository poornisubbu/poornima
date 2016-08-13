import java.io.*;
import java.util.*;
class reverse
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 String s=sc.nextLine();
 StringBuffer sb=new StringBuffer(s);
 StringBuffer sb1=new StringBuffer(sb.reverse());
 System.out.println(sb);
 String a=sb1.toString(); 
 remove r=new remove();
 System.out.println(r.vowelremove(a));
 }
}
class remove
{
 public String vowelremove(String b)
 {
    StringBuffer sb2=new StringBuffer(b);
   char vowel[]={'a','e','i','o','u','A','E','I','O','U'};
   int i,j;
   for(i=0;i<sb2.length();i++)
   {
     for(j=0;j<vowel.length;j++)
     {
      if(vowel[j]==sb2.charAt(i))
      {
        sb2.deleteCharAt(i);
        i=-1;
        break; 
      }
     }
   }
    String s1=sb2.toString();
   return(s1);
}
}
    
