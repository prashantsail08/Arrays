import java.util.Scanner;

public class SecondHighest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");

		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = 0;
		int max1 = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Second Highest Number :"+ max);
		for (int i = 0; i < n; i++) {
			if (max1 < arr[i] && arr[i] < max) {
				max1 = arr[i];
			}
		}
		System.out.println("Second Highest Number :"+ max1);
	}
}
