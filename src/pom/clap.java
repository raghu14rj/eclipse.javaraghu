package pom;

public class clap {
	static void sub(int a)
	{
		System.out.println("integer");
	}
static void sub(char a)
{
	System.out.println("character");
}
static void sub(String a)
{
	System.out.println("String");
}
static void sub(char b,String a)
{
	System.out.println("character & String valve");
}
public static void main(String[]args)
{
sub(20);
sub('a');
sub("add");
}
}