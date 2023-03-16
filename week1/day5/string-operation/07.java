//Replacing the string

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the content of the document");
        String inp = sc.nextLine();
		System.out.println("Enter the old name of the company");
		String oldName = sc.nextLine();
		System.out.println("Enter the new name of the company");
		String newName = sc.nextLine();
        System.out.println("The content of the modified document is\n" + inp.replaceAll(oldName, newName));
        sc.close();
     }
}
