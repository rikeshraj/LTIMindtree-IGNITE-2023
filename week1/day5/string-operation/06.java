//String API : split() : Illustration 

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inp = sc.nextLine();
		String[] str = inp.split(" ");
		System.out.println("The words in the string are");
		for(String i : str)
			System.out.println(i);
		sc.close();
	}
}
