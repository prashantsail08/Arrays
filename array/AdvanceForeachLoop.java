package array;
import java.util.Scanner;
public class AdvanceForeachLoop
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter 5 Number");
		for(int i=0; i<5; i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(int i:arr) 
		{
			arr[i]=sc.nextInt();
		}
	}
}
