package array;
//find Maximum/ Highest Number in array
import java.util.Scanner;

public class ArrayProgram4
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Number:");
		int max=arr[0];
		for(int i=0; i<n; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<n; i++) 
		{
			if(max<arr[i]) { // for lowest/ minimum element if(max>arr[i]
				max=arr[i];
			}
		}
		System.out.println("Highest NUmber:"+max);
	}
}
//
//Output
//Enter Size:
//3
//Enter Number:
//10
//20
//30
//Highest NUmber:30
//

