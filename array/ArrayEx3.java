package array;
import java.util.Scanner;
public class ArrayEx3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter 5 Number");
		arr[0]=sc.nextInt();
		arr[1]=sc.nextInt();
		arr[2]=sc.nextInt();
		arr[3]=sc.nextInt();
		arr[4]=sc.nextInt();
		System.out.print("Your array is:");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}

//Output
//Enter 5 Number5
//4
//2
//3
//5
//Your array is:5
//4
//2
//3
//5
