package array;
//Display only even number from array
import java.util.Scanner;
public class ArrayProgram2 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size");
		int n= sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Number");
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) 
		{
			if(arr[i]%2==0) 
			{ // for odd- if(arr[i]%2!=0) //
				System.out.println("Even Number : "+arr[i]);
			}
		}
	}
}
//
//Output
//Enter Size
//2
//Enter Number
//5
//4
//Even Number : 4
//
