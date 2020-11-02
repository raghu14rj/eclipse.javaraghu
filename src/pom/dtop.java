/*wap to find  the armstrong number*/

package pom;

public class dtop {
public static void main(String[]args)
{
	int a=121;
	int no=a;
	int sum=0;
	while (a!=0)
	{
		int rem=a%10;
		sum=sum+rem*rem*rem;
		a=a/10;
	}
	if(no==sum)
	{
		System.out.println("armstrong number");
	}
	else
	{
		System.out.println("not a armstrong number");
	}
}
}
