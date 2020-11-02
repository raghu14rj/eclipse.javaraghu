package pom;

import java.util.Scanner;

public class ztom 
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
String s1=sc.next();
char ch[]=s1.toCharArray();
String s2="";
for(int i=0;i<ch.length;i++)
{
	if(Character.isAlphabetic(ch[i]))
	{
		s2=s2+ch[i];
	}
}System.out.println(s2);
	

}
}
