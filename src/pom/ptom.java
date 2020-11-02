/*wap to count no of characters in a string*/


package pom;

public class ptom 
{

	public static void main(String[]args)
	{
		String s1="selenium";
		int count=0;
		String s2="";
		int n=s1.length();
		for(int i=0;i<=n;i++)
		{
			count++;
		
		s2=s2+s1.charAt(i);
		System.out.println(count);
	}}

}
