package pom;

public class dom {
String firstname;
String lastname;
String emailid;
dom(String firstname,String lastname,String emailid)
{
	this.firstname=firstname;
this.lastname=lastname;
this.emailid=emailid;
}

public static void main(String[]args)
{
	dom d1=new dom("raghu","joshi","raghu14.rj@gmail.com");
	System.out.println(d1.firstname);
	System.out.println(d1.lastname);
	System.out.println(d1.emailid);
}
}