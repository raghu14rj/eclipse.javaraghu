package pom;

public class calculator
{
void operate()
{ 
	System.out.println("operation");
}
}
class add extends calculator
{
	void operate()
	{
		System.out.println("addition");	
	}
}
class multiply extends calculator
{
	void operate()
	{
		System.out.println("multiplition");
	}
}
class division extends calculator
{
	void operate()
	{
		System.out.println("division");
	}
}
class main
{
	static void operations(calculator a1) 
	{
		a1.operate();
		}
	public static void main(String[]args)
	{
		add a=new add();
		multiply m=new multiply();
		division d=new division();
		operations(a);
		operations(m);
		operations(d);
	
		}
	}
