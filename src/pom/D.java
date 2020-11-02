package pom;

 class test
{
void files()

{
	System.out.println("1");
	
	}
}

class A extends test
{
	void files()
	{
		System.out.println("2");
	}
}

class B extends test
{
	 void files()
	 {
		 System.out.println("3");
	 }
}

class C extends test
{
	void files()
	{
		System.out.println("4");
	}
	
}

class D 
{
	static void sub(test t1)
	{
		t1.files();
	}

public static void main(String arg[])
{
  A A1 = new A();
  B B1 = new B();
  C C1 = new C();

	sub(A1);
	sub(B1);
	sub(C1);
	
}

}




















