//Adjacent characters

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        String c = "";
        int i=0;
        while(true) {
            c = c + s.charAt(i);
            if(i== s.length()-1)
                break;
            if(s.charAt(i)==s.charAt(i+1)) {
                c = c +"*";
            }
            i++;
        }
        System.out.println("The processed string is "+c);
        sc.close();        
     }
}
