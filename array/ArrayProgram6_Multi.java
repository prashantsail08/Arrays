package array;
import java.util.Scanner;  // take input from user and do sum of rows and column
public class ArrayProgram6_Multi {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int s=0;
		System.out.print("Enter rows");
		int m=sc.nextInt();
		System.out.print("Enter Coloumn");
		int n=sc.nextInt();
		int arr[][]=new int [m][n];
		System.out.println("Enter Number");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				s=s+arr[i][j];
			}
		}
		System.out.println("Sum:"+ s);
		
	}
}
//
//Output
//Enter rows2
//Enter Coloumn2
//Enter Number
//3
//4
//2
//1
//Sum:10
//
