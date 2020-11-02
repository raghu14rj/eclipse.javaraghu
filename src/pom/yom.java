package pom;

class yom 
{
public static void main(String[]args)
{
String s1= "the hello hi ";
char ch[]=s1.toCharArray();
int n=ch.length;
int count=0;
for(int i=0;i<=n-1;i++)
{
if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
{
	count++;
}
	if(count>=1)
	{
		System.out.println("it is present");
	}
	else
	{
		System.out.println("it is not present");
	}
	
	
	
	
	
	
	/*if (ch[i]!= 0);
	{
for(int j=i+1;j<=n-1;j++)
{
	if(ch[i]==(ch[j]))
{ 
	ch[j]=0;
} */
	System.out.println(count);
}
}
}
