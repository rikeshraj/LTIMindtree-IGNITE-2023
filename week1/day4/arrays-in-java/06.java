//Array mode

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> l = new ArrayList<Integer>();

		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		System.out.println("Enter the elements in the array");
		int[] arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = sc.nextInt();
		
		int maxCount = 0, val = 0;
		for(int i=0; i<n; i++) {
			int count = 0;
			for(int j=i+1; j<n; j++) {
				if(arr[j] == arr[i])
					count++;
			}
			if(count>maxCount) {
				maxCount = count;
				val = arr[i];
				l.clear();
			}
			else if(count == maxCount) {
				l.add(arr[i]);
			}
		}

		if(l.size()>1)
			System.out.println("The mode of the array is none");
		else
			System.out.println("The mode of the array is\n" + val);
	}

}
