package array;
import java.util.Scanner;
public class ForEachLoopEx3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1- Int Array");
		System.out.println("2-String array");
		System.out.println("Choose 1 or 2");
		int c=sc.nextInt();
		switch(c){
		case 1:
			System.out.println("you Selected int Array");
			System.out.println("Enter Size");
			int n=sc.nextInt();
			System.out.println("Enter Elements");
			int arr[]=new int[n];
			for(int i=0; i<n; i++) {
				arr[i]=sc.nextInt();
			}
			
			for(int i:arr) {
				System.out.print(i);
			}
			break;
		case 2:
			System.out.println("you Selected String Array");
			System.out.println("Enter Size");
			int a=sc.nextInt();
			System.out.print("Enter Elements");
			String b[]=new String[a];
			for(int i=0; i<a; i++) {
				b[i]=sc.next();
			}
			for(String i:b) {
				System.out.println(i);
			}
			break;
			default:
				System.out.print("Select 1 and 2");
		}
		
	}
}
//
//Output
//
//1- Int Array
//2-String array
//Choose 1 or 2
//1
//you Selected int Array
//Enter Size
//2
//Enter Elements
//10
//20
//1020
//
//
//1- Int Array
//2-String array
//Choose 1 or 2
//2
//you Selected String Array
//Enter Size
//2
//Enter Elementshello
//hiii
//hello
//hiii


