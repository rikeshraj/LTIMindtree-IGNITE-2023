//Array median

import java.util.*;
import java.text.DecimalFormat;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		double[] arr = new double[n];

		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);

		double median = 0;
		if(n%2==0)
			median = (arr[n/2] + arr[n/2-1])/2;
		else 
			median = arr[n/2];

		System.out.println("The median of the array is " + df.format(median));
	}
}
