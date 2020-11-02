package pom;

class hom 
{
void add()
{
	System.out.println("add method");
}
}
class fom extends hom
{
	void sub()
	{
		System.out.println("sub method");
	}
}
class som extends fom
{
	void disp()
	{
		System.out.println("disp method");
	}
}
class iom extends hom
{
	void mul()
	{
		System.out.println("mul method");
		
	}
}
class gom
{
	public static void main(String[]args)
	{
	som f1=new som();
	f1.add();
	f1.sub();
	f1.disp();
	iom i1=new iom();
	i1.add();
	i1.mul();
	}
	}
