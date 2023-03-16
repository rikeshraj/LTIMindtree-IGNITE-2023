//Array deletion

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		System.out.println("Enter the location where you wish to delete an element");
		int location = sc.nextInt();

		if(location>n)
			System.out.println("Invalid Input");
		else {
			for(int i=location-1; i<n-1; i++)
				arr[i] = arr[i+1];

			System.out.println("Array after deletion is");
			for(int i=0; i<n-1; i++)
				System.out.println(arr[i]);
		}
	}
}
