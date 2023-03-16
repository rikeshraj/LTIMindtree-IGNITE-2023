//Row sum and Column sum

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the row size");
        int m = sc.nextInt();
        System.out.println("Enter the column size");
        int n = sc.nextInt();
        
        int[][] arr = new int[m][n];
        System.out.println("Enter the matrix values");
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                arr[i][j] = sc.nextInt();
        
        System.out.println("The matrix is");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++)
                System.out.println(arr[i][j] + " ");
            System.out.println();
        }
        
        int[] sumRow = new int[m];
        int[] sumColumn = new int[n];
        for(int i=0; i<m; i++) {
        	int sum = 0;
        	for(int j=0; j<n; j++)
        		sum += arr[i][j];
            sumRow[i] = sum;
        }
        for(int i=0; i<n; i++) {
            int sum = 0;
            for(int j=0; j<m; j++)
                sum += arr[j][i];
            sumColumn[i] = sum;
        }
        for(int i=0; i<m; i++)
            System.out.println("Row " + (i+1) + " sum is " + sumRow[i]);
        for(int i=0; i<n; i++)
            System.out.println("Column " + (i+1) + " sum is " + sumColumn[i]);
        
        sc.close();
    }
}

