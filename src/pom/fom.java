package pom;
import java.util.HashMap;
 class atom1
{
	 public static void main(String[]args)
	{
		 String s1="the java";
	
	char ch[]= s1.toCharArray();
	HashMap<Character,Integer>a1=new HashMap<>();
	for(char c:ch)
	{
		if(a1.containsKey(c))
		{
			a1.put(c,a1.get (c)+1);
		}
		else
		{
			a1.put(c, 1);
		} System.out.println(a1);
	}
}

}