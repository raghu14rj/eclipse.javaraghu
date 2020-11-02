package pom;

abstract class topper {
abstract void add();
abstract void sub();}
 class Disp extends topper
{
void add()
{
	System.out.println("add method");
}
void sub()
{
	System.out.println("sub method");
}
}
class lutop
{
	public static void main(String[]args)
	{
		Disp t1=new Disp() ;
		t1.add();
		t1.sub();
	}
}