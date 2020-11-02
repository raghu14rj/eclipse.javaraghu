package pom;

public class tom1 {
static tom1 a;
static int count=0;
private tom1()
{
}
static tom1 gettom1()
{
	if (count==0)
	{
		a=new tom1();
	count++;
}
	return a;
}
public static void main(String[]args)
{
	tom1 t1=new tom1();gettom1();
	System.out.println(t1);
	tom1 t2=new tom1();gettom1();
	System.out.println(t2);
}
}