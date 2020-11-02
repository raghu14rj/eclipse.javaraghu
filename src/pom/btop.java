package pom;

public class btop {
public static void main (String[]args)
{
	int number=25;
	int sum=0;
	for(int i=1;i<=number;i++)
	{
		if(number%i==0)
		{
			sum=sum+i;
		}
	}
	if(sum==number)
	{
		System.out.println("perfectnumber");;
	}
	else
	{  System.out.println("not perfect number");
	
	}
}
}