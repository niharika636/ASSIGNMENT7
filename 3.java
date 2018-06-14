import java .lang.*;
import java.io.*;
class Demo2{
void greatestofno(int a,int b)
{
  if(a>b)
 System .out.println("The greatest of the two no:"+a);
else
System .out.println("The greatest of the two no:"+b);} }
class Test{
public static void main(String[] args) throws Exception {
        Console c = System.console();
        System .out.println("Enter a no");
        String s1= c.readLine();
        int a=Integer.parseInt(s1);
          System .out.println("Enter a no");
          s1=c.readLine();
          int b=Integer.parseInt(s1);
Demo2 d=new Demo2();
          d.greatestofno(a,b);
}}