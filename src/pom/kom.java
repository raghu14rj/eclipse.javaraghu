package pom;

 class eom 
 {
void sub()
{
	System.out.println("sub method");
}
}
class aom extends eom
{
	void add()
	{
		System.out.println("add method");
	}
}
class bom extends aom
{
	void disp()
	{
		System.out.println("disp method");
	}
}
class plom
{
	public static void main(String[]args)
	{
		bom b1=new bom();
		b1.sub();
		b1.add();
		b1.disp();
	}
}