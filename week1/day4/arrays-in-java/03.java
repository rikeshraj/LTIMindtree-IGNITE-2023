//Number of Distinct Elements in an Unsorted Array

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();

		int i, j, count = 0;

		for(i=0; i<n; i++) {
			for(j=0; j<i; j++)
				if(arr[i] == arr[j])
					break;
			if(i==j)
				count++;
		}

		System.out.println(count);
	}
}
