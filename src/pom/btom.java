package pom;

 class btom
 {
public static void main(String[]args)
{
	int arr[]={10,20,30,40};
	int n=arr.length;
	for(int i=0;i<n;i++)
	{
		for(int j=i+1;j<n;j++)
		{
	  if(arr[i]<arr[j])
	  {
		  int c=arr[i];
		  arr[i]=arr[j];
		  arr[j]= c;
	  }
		}
	}
}
}