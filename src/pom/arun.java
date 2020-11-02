package pom;

public class arun {

void feature()
{ 
	System.out.println("feature");
}
}
class calls extends arun
{
	void feature()
	{
		System.out.println("call feature");	
	}
}
class chats extends arun
{
	void feature()
	{
		System.out.println("chats feature");
	}
}
class status extends arun
{
	void feature()
	{
		System.out.println("status feature");
	}
}
class banana
{
	static void transactions(arun a1) 
	{
		a1.feature();
		}
	public static void main(String[]args)
	{
		calls a=new calls();
		chats m=new chats();
		status d=new status();
		transactions(a);
		transactions(m);
		transactions(d);
	
		}
	}
