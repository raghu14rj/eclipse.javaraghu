package pom;



class ktom 
 {
 static double sub(double a,int b)
	 {
		 double area=a*b*b;
		 return area;
	 }
int add(int a )
{ 
	int area1=a*a;
System .out.println(area1);
return area1;
}
 }
class dtom
 {
public static void main(String[]args)
{
	ktom a1=new ktom();
double a= ktom.sub(3.142,5);	
System.out.println(a);
a1.add(30);
}
}