package pom;

class lclap
{
void chats()
{
	System.out.println("no values");
}
}
 class whattsapp extends lclap
{
	void chats()
	{
		System.out.println("whattsapp chats");
	}
}
 class facebook extends lclap
{
	void chats()
	{
		System.out.println("facebook chats");
	}
}
 class instagram extends lclap
{
	void chats()
	{
		System.out.println("instagram chats");
	}
}
 class ktopper
{
	 static void sample(lclap a1)
{
	a1.chats();
}

	public static void main(String[]args)
	{
	whattsapp w1=new whattsapp();
	facebook f1=new facebook();
	instagram i1=new instagram();
     sample(w1);
     sample(f1);
     sample(i1);	}
}