package pom;

public class login extends Exception
{
static void sub() throws login
{
	if(20>=25)
	{
		System.out.println("hi");
	}
	else
		{
		throw new login();
		}
		}
public static void main(String[]args)
{
	try
	{
		sub();
	}
	catch(login E)
	{
		System.out.println("handled");
	}

		
	}
		
	}

