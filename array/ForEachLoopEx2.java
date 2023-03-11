package array;
import java.util.Scanner;
public class ForEachLoopEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Size");
		int n=sc.nextInt();
		String arr[]=new String[n];
		System.out.print("Enter Elements");
		for(int i=0; i<n; i++) {
			arr[i]=sc.next();
		}
		for(String i:arr) {
			System.out.print(i);
		}
	}
}
//
//OUTPUT
//ENTER SIZE3
//ENTER ELEMENTS5
//2
//3
//523
//
