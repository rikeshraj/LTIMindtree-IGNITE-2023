/*
Print pattern
****
****
****
****
for n=4
*****
*****
*****
*****
*****
for n=5
*/

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=n; i>0; i--) {
			for(int j=n; j>0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
