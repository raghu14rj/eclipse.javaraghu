package pom;

class zom 
{
public static void main(String[]args)
{
	int ch[]= {10,20,30,40,30,20};
	int n=ch.length;
	for(int i=0;i<=n-1;i++)
	{
		if(ch[i]!=0)
		{
			for(int j=i+1;j<=n-1;j++)
				{
				if(ch [i]==ch [j])
				{
			ch[j]=0;
				}
		System.out.println(ch[i]);
	}
}

}
}}