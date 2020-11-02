package pom;

 class vom 
 {
public static void main(String[]args)
{
	String s1="raghu14.rj@gmail.com";
	String alpha=" ";
	String number=" ";
	String sc=" ";
	int n=s1.length();
	for(int i=0;i<=n-1;i++)
	{
		if(Character.isAlphabetic(s1.charAt(i)));
		{
			alpha=alpha+s1.charAt(i);
		}
	  if(Character.isDigit(s1.charAt(i)));
		{
		number=number+s1.charAt(i);
		}
		
		
			sc=sc+s1.charAt(i);
	
		}
	System.out.println(alpha);
	System.out.println(number);
	System.out.println(sc);
}

 }
	