package array;
//Display Sum of even number from array
import java.util.Scanner;
public class ArrayProgram3 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		int s=0;
		int arr[]=new int[n];
		System.out.println("Enter Number:");
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++)
		{
			if(arr[i]%2==0)
			{
				s=s+arr[i];
			}
		}
		System.out.println("Sum :"+s);
	}
}
//
//Output
//Enter Size:
//3
//Enter Number:
//1
//2
//3
//Sum :2
//

