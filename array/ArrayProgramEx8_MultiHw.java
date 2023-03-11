package array;
  // HW
import java.util.Scanner;
public class ArrayProgramEx8_MultiHw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rows");
		int m = sc.nextInt();
		System.out.println("Enter Coloumn");
		int n =sc.nextInt();
		int arr1[][]=new int[m][n];
		System.out.println("Enter Number");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(arr1[i][j]);
			}
		}
		int arr2[][]=new int[m][n];
		System.out.println("Enter Number");
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		
		/*for(int i=0; i<m; i++) {
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
		}*/
	}
}
