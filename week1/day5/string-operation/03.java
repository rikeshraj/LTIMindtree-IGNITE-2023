//String API – lastIndexOf() - Illustration

import java.util.*;
class Main {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            String s = sc.nextLine();
            System.out.println("Enter the string to be searched");
            String a = sc.nextLine();
            System.out.println("The index of last occurence of "+(char)34+a+(char)34+" is "+s.lastIndexOf(a));
            System.out.println("Enter the index limit");
            int n = sc.nextInt();
            System.out.println("First occurence of "+(char)34+a+(char)34+" from "+n+"th index backwards is "+(s.substring(0,n)).lastIndexOf(a));
            sc.close();
     }
}
