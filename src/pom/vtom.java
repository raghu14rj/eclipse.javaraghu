/*wap to print fibonacci from 1 to 10*/

package pom;

public class vtom
{
public static void main(String[]args)
{
	int fib1=0;
	int fib2=1;
	int fib3;
	for(int i=1;i<=10;i++)
	{
		fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		System.out.print(" "+fib3);
	}
}
}