package pom;

public class ltom 
{
public static void main(String[]args)
{
	int i=1234;
	int sum=0;
	while(i!=0)
	{
		int rem=i%10;
		sum=sum*10+rem;
		i=i/10;
	}
System.out.println(sum);
}
}
