//Minimum scalar product

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] v1 = new int[n];
		int[] v2 = new int[n];
		for(int i=0; i<n; i++)
			v1[i] = sc.nextInt();
		for(int i=0; i<n; i++)
			v2[i] = sc.nextInt();
		Arrays.sort(v1);
		sort_des(v2, n);
		int sum = 0;
		for(int i=0; i<n; i++)
			sum += (v1[i]*v2[i]);
		System.out.println(sum);
	}
	static void sort_des(int arr[], int n) {
			int i,j;
			for (i = 0; i < n; ++i)
				for (j = i + 1; j < n; ++j)
					if (arr[i] < arr[j]) {
						int a = arr[i];
						arr[i] = arr[j];
						arr[j] = a;
				}
	}
}
