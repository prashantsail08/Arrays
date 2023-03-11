package array;
import java.util.Scanner;
public class MultiDimensionEx1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int m = sc.nextInt();
		System.out.println("Enter Coloumn");
		int n =sc.nextInt();
		int arr[][]=new int[m][n];
		System.out.println("Enter Number");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
//
//Output
//
//Enter Rows
//2
//Enter Coloumn
//2
//Enter Number
//4
//3
//2
//1
//4 3 
//2 1 
//
