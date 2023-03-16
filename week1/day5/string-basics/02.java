//String Processing

import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception  {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input string");
			String str = sc.nextLine();
			str = str.trim();

			String[] copy = str.split(" ");
			System.out.print("The processed string is " + copy[0]);
			for(int i=1; i<copy.length; i++) {
				System.out.print(" " + copy[i].toUpperCase());
			}
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
