package pom;

public class htom {
public static void main(String[]args)
{
	int no=121;
	int sum=0;
	while(no!=0)
	{
		int rem=(no%10);
		sum=sum*10+rem;
		no=no/10;

	} System.out.println(sum);
}
}
