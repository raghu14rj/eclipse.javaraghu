package pom;

public class tom {
private int a=10;
 int geta()
{
	return a;
}
 void set(int b)
{
	a=b;
}
public static void main(String[]args)
{
	tom t1=new tom();
	System.out.println(t1.geta());
t1.set(20);
System.out.println(t1.geta());
}
}