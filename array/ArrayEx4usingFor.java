package array;
import java.util.Scanner;
public class ArrayEx4usingFor
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.println("Enter 5 Number");
		for(int i=0; i<5; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array List:");
		for(int i=0; i<5; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
//
//output
//Enter 5 Number
//5
//2
//3
//5
//6
//Array List:
//5
//2
//3
//5
//6
//
