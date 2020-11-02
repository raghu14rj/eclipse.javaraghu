package pom;

public class apple {

void transact()
{ 
	System.out.println("transact");
}
}
class mastercard extends apple
{
	void transact()
	{
		System.out.println("use mastercard");	
	}
}
class visa extends apple
{
	void transact()
	{
		System.out.println("use visa card");
	}
}
class credit extends apple
{
	void transact()
	{
		System.out.println("use creditcard");
	}
}
class tester
{
	static void transactions(apple a1) 
	{
		a1.transact();
		}
	public static void main(String[]args)
	{
		mastercard a=new mastercard();
		visa m=new visa();
		credit d=new credit();
		transactions(a);
		transactions(m);
		transactions(d);
	
		}
	}
