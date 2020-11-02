package pom;

public class sample {
static void add(String a,int b, char c)
{
	System.out.println("1");
}
static void add(char a,int b,String c)
{
	System.out.println("2");
}
static void add(int a,char b,String c)
{
	System.out.println("3");
}
public static void main(String[]args)
{
	add('a',20,"ad");
	}
}
