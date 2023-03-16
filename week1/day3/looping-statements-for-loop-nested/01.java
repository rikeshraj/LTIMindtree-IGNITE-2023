/*
Print pattern
1 2 3 4 5
2 3 4 5
3 4 5
4 5
5 
*/

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=i; j<=n; j++)
                System.out.print(j + " ");
        }
        System.out.println();
        sc.close();
    }
}
