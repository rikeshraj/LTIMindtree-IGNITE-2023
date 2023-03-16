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
            for(int j=n; j>0; j--) {
                arr[i-1][n-j] = j+k;
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
    }
}

