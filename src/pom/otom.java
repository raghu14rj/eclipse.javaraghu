/*prime number*/

package pom;

public class otom 
{
public static void main(String[]args)
{
	int a=30;
	boolean flag=false;
for(int i=2;i<a;i++)
{
	if(a%i==0)
	{
		flag=true;
	}
}
if(flag==false)
{
	System.out.println("it is a prime number");
}
else
{
	System.out.println(" it is not a prime number");
}
}
}