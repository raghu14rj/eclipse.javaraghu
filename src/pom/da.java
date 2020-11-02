package pom;

 class da
{
 String firstname;
 String lastname;
 int age;
da (String a,String b,int c)
{
	 firstname=a;
     lastname=b;
     age=c;
}
public static void main(String[]args)
{
	da t1=new da("sundra","kumar",28);
	System.out.println(t1.firstname);
	System.out.println(t1.lastname);
	System.out.println(t1.age);
}
}