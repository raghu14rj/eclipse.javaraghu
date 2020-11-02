package pom;

public class gtom 
{
public static void main(String[]args)
{
	int number=30;
	boolean flag=false;
	for(int i=2;i<number;i++)
		{if(number%i==0)
		{ flag=true;
		}}
	if (flag==false)
	{
		System.out.println("it is prime number");
		}
	else
	{ System.out.println("it is not a prime number");		
}
}
}