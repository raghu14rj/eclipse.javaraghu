package pom;

 class ftom 
{
public static void main(String[]args)
{
int number=30;
int sum=0;
for(int i=1;i<number;i++)
{ if(number%i ==0)
	sum=sum+i;
if(number==sum)
{
	System.out.println("perfect number");
}
else
{
	System.out.println("it is not a perfect number");
}
}
}
}