package pom;

class jom
{
public static void main(String[]args)
{
int i=452;
int count=0;	
int no=i;
while (i!=0);
	{
		int rem=(i%10);
count=(count*10+rem);
count++;
i=i/10;
	}
	if(no==count)
	{
		System.out.println("it is same");
	}
	else
		{
		System.out.println("it is not same");
		}
}
}