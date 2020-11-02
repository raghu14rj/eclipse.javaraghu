/*wap to count no of vowels in a string*/ 


package pom;

public class stom
{
public static void main(String[]args)
{
	String s1="the selenium";
	char[]ch=s1.toCharArray();
	int count=0;
	int n=ch.length;
	for(int i=0;i<n;i++)
	{
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
		{
			count++;
		}
	System.out.println(count);
	}
	
}
}
