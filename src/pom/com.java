package pom;
 
interface top
{
}

abstract class kom extends tom
{
 void sub()
{
System.out.println("sub method");
}
void add()
{
System.out.println("add method");
}
}
class lom extends kom
{
	void disp()
	{
		System.out.println("disp method");
	}
}
class com
{
	public static void main(String[]args)
{
	lom l1=new lom();
	l1.add();
	l1.sub();
	l1.disp();
}
}
