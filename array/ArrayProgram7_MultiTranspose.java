package array;
  // Transpose of  Matrix -> rows ko column and column ko rows
import java.util.Scanner;
public class ArrayProgram7_MultiTranspose {
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
		System.out.println("After Transporse: ");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++){
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}
//
//Output
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
//After Transporse: 
//4 2 
//3 1 
//


