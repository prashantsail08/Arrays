package array;  // Sorting Array
import java.util.Scanner;
public class ArrayProgram5
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Number:");
		//int s=arr[0];
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n; i++)
		{
			for(int j=i+1; j<n; j++)
			{
				int t=0;
				if(arr[i]>arr[j]){ // a[i]<arr[j] for decending order 
					t=arr[i];
					arr[i]=arr[j];
					arr[j]=t;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
//
//Output
//Enter Size:
//3
//Enter Number:
//30
//10
//20
//10
//20
//30
//

