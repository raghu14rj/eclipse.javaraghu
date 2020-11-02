package pom;

 class rom
 {
public static void main(String[]args)
{ int a=1;
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
	if(i+j>=4+1)
	{	System.out.print("* ");
	}
	else 
	{ System.out.print(" ");
		}}
	System.out.println();

 }

  
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=4;j++)
		{
	if(i<j)
	{	System.out.print("* ");
	}
	else 
	{ System.out.print(" ");
		}}
	System.out.println();

}
}}