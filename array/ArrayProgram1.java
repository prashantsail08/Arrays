package array;

import java.util.Scanner;
// Sum of all elements of array
public class ArrayProgram1
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please Size of Array");
		int s=0;
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Number");
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n; i++) 
		{
			s=s+arr[i];
		}
		System.out.print("Sum:"+s);
	}
}
//
//Output
//please Size of Array
//2
//Enter Number
//10
//20
//Sum:30

