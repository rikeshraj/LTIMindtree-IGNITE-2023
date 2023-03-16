//Generate series 3,7,15,31,63,...

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int j=4;
		for(int i=0; i<num; i++) {
			System.out.print(j-1 + " ");
			j *= 2;
		}
		sc.close();
	}
}
