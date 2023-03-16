//Character - upper or lower

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inp = sc.next().charAt(0);
        if(Character.isLowerCase(inp))
            System.out.println(inp + " is lowercase letter");
        else if(Character.isUpperCase(inp))
            System.out.println(inp + " is uppercase letter");
        else
            System.out.println(inp + " is neither an uppercase or lowercase letter");
        sc.close();
     }
}
