//Finding the Sum of Array Elements

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		int sum = 0;
		for(int i : arr)
			sum += i;
		System.out.println("The sum of the elements in the array is " + sum);
	}
}
