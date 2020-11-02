package pom;
class hdfc
{
	private static int password;
	public static  int get_password()
	{
		return password;
	}
public void set_password(int password)
{
	this.password=password;
	}
}
 class demo
{
	public static void main(String[]args) 
	{
	System.out.println(hdfc.get_password());
	hdfc f1=new hdfc();
	f1.set_password(12345);
    System.out.println(hdfc.get_password());
}
}