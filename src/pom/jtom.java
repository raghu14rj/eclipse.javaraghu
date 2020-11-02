package pom;

public class jtom {
public static void main(String[]args)
{
	int no=126;
int a=no;
int sum=0;
while (a!=0)
{
int rem=a%10;
sum=sum+(rem*rem*rem);
a=a/10;
}
if(sum==no)
{
	System.out.println("armstrong");
}
else
{
	System.out.println("not armstrong");
}
}
}
