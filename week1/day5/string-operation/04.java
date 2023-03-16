//String API : startsWith() : Illustration

import java.util.*;
public class Main {
    public static void main(String[] args) {
		// fill your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inp = sc.nextLine();
		System.out.println("Enter the start string");
		String start = sc.nextLine();
		if(inp.startsWith(start))
			System.out.println("\"" + inp + "\" starts with \"" + start + "\"");
		else
			System.out.println("\"" + inp + "\" does not start with \"" + start + "\"");
		sc.close();
	}
}
