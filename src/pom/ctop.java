/*it is a palandrom*/

package pom;

public class ctop
{
public static void main(String[]args)
{
	int a=121;
	int sum=0;
	while(a!=0)
	{
		int rem=a%10;
		sum=sum*10+rem;
		a=a/10;
	} System.out.println(sum);
}
}
