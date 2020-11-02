package pom;
import java.util.Random;
class uom
{
	public static void main(String[]args) 
{
String s1="abcdefghijklmnopqrstuvwxyz";
String s2="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
String s3="0123456789";
String s5=s1+s2+s3;
String s4="";
 Random r1=new Random();
for(int i=0;i<=5;i++)
{
	s4=s4+s5.charAt(r1.nextInt(s5.length()));
}
	System.out.println(s4);
}
}