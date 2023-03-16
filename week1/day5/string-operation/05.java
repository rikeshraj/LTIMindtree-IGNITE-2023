//String API : endsWith() : Illustration

import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String inp = sc.nextLine();
		System.out.println("Enter the end string");
		String end = sc.nextLine();
		if(inp.endsWith(end))
			System.out.println("\"" + inp + "\" ends with \"" + end + "\"");
		else
			System.out.println("\"" + inp + "\" does not end with \"" + end + "\"");
		sc.close();
	}
}
