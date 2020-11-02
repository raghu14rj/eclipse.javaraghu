package pom;

 class pktom 
 {
public static void main(String[]args)
{
	int binary=100111000;
	int sum=0;
	int mul=1;
	while(binary!=0);
	{int rem=binary%2;
		sum=sum+rem*mul;
	binary=binary/2;
	}System.out.println(sum);
}
 
 
 
 
 
 }

