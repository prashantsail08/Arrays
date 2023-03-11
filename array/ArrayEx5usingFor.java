package array;
import java.util.Scanner; //take size of array from user 
public class ArrayEx5usingFor
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("please Size of Array");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("Enter Number");
		
		for(int i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Your Array List:");
		
		for(int i=0;i<n; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
//
//Output
//please Size of Array
//2
//Enter Number
//10
//20
//Your Array List:
//10
//20
