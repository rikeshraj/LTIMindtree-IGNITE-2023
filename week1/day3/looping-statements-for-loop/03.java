//Generate series 4,32,128,256, ….n

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a =4,b=3;
        for(int i=1;i<=n;i++) {
            System.out.println(a);
            int j = (int)Math.pow(2,b);
            b--;
            a = a*j;
        }
        sc.close();
    }
}
