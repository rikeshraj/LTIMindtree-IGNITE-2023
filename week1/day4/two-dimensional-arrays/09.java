//Mahirl and Matrix 

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] arr = new int[n][n];
        int k=0;
        for(int i=1; i<=n; i++) {
            if(i%2 == 0) {
                for(int j=n; j>0; j--) {
                    arr[i-1][n-j] = j+k;
                }
            }
            else {
                for(int j=1; j<=n; j++) {
                    arr[i-1][j-1] = j+k;
                }
            }
            k += n;
        }
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(arr[r-1][c-1]);

        sc.close();
    }
}

