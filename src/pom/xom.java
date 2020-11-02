package pom;

class xom 
	{
		public static void main(String[]args)
		{
			String s1="the java";
			String s2="";
			int n=s1.length();
			for (int i=n-1;i>=0;i--)
			{
				s2=s2+s1.charAt(i);
			}
				System.out.println(s2);
		
	/*	if (s1==s2)
			{
			System.out.println("it is palandom");
			}
		else
		{
			System.out.println("it is not a palandrom");
		}*/
		}
	}
	

