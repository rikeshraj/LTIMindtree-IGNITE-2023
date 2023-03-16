//Calculator

import java.util.*;
class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first value :");
        int a = sc.nextInt();
        System.out.println("Enter the second value :");
        int b = sc.nextInt();
        System.out.println("Enter the choice from the menu\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        int choice = sc.nextInt();
        
        int result = 0;
        
        switch(choice) {
            case 1:
                System.out.println("The value after Addition is " + (a+b) + ".");
                break;
            case 2:
                System.out.println("The value after Subtraction is" + (a-b) + ".");
                break;
            case 3:
                System.out.println("The value after Multiplication is " + (a*b) + ".");
                break;
            case 4:
                System.out.println("The value after Division is " + (a/b) + ".");
                break;
        }
     }
}
