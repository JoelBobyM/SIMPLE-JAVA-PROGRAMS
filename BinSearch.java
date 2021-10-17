import java.util.Scanner;
class BinSearch
	{
	public static void main(String args[])
	{
	Scanner obj=new Scanner(System.in);
	System.out.print("\n Enter number of elements:");
	int n=obj.nextInt();
	int A[]=new int[n];
	System.out.print("\n Enter the elements:");
	for(int i=0;i<n;i++)
	{
	 A[i]=obj.nextInt();
	}
	System.out.print("\n Elements of the array are:");
	for(int i=0;i<n;i++)
	{
	 System.out.print(A[i]+"    ");
	}
	System.out.print("\n Enter the element to be searched:");
	int key=obj.nextInt();
	int low=0,high=n-1,mid=0;
	while(low<=high)
	{
	mid=(low+high)/2;
	if(key==A[mid])
	{
	 System.out.println("\n Element found at:"+" "+(mid+1));
	 break;
	}
	else if(key>A[mid])
	 low=mid+1;
	else
	 high=mid-1;
	}
	if(low>high)
	System.out.println("\n Element not found");
	}
	}
