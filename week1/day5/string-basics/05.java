//equals() and equalsIgnoreCase()

import java.util.*;
public class Main {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Address 1:");
		String address1 = sc.nextLine();
		System.out.println("Address 2:");
		String address2 = sc.nextLine();
		if(address1.equals(address2))
			System.out.println("RED");
		else if(address1.equalsIgnoreCase(address2))
			System.out.println("BLUE");
		else if(address1.replaceAll("\\s+","").equals(address2.replaceAll("\\s+","")))
			System.out.println("YELLOW");
		else
			System.out.println("GREEN");
	}
}
