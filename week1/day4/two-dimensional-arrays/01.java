//Minimum Element In The Matrix 

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                arr[i][j] = sc.nextInt();
        int min = arr[0][0];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                if(min>arr[i][j])
                    min = arr[i][j];
        System.out.println("The minimum element is " + min);
    }
}

