package pom;
import java.util.Random;

class wom 
{
public static void main(String[]args)
{
	String s1="0123456789";
	String s2="";
	Random r1=new Random();
	for(int i=0;i<=3;i++)
	{
		s2=s2+s1.charAt(r1.nextInt(s1.length()));
	}
	System.out.println(s2);
}
}
