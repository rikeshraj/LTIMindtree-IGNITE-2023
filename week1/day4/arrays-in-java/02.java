//Compatible Arrays

import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		for(int i=0; i<n; i++)
			arr1[i] = sc.nextInt();
		for(int i=0; i<n; i++)
			arr2[i] = sc.nextInt();
		int f = 1;
		for(int i=0; i<n; i++)
		if(arr1[i] < arr2[i])
			f = 0;
		if(f == 1)
			System.out.println("Compatible");
		else
		System.out.println("Incompatible");
	}
}
