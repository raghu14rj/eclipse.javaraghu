/*wap to print all prime nos between 1 to 100 */

package pom;

public class qtom 
{
public static void main(String[]args)
{
	

for(int i=1;i<=100;i++)
{
	int count=0;
	for(int j=1;j<=i;j++)

{
	if(i%j==0)
	{ count++;
	
	}
}
if(count==2)
{
	System.out.print(i+" ");
}
}
}}