//Fourth row sum Matrix

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3x3 matrix");
        int [][] a = new int[3][3];
        int [][] b = new int[4][4];
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++) {
                a[i][j] = sc.nextInt();
                b[i][j] = a[i][j];
            }
        int sum;
        for(int i =0;i<3;i++) {
            sum =0;
            for(int j =0;j<3;j++)
                sum = sum + a[i][j];
            b[i][3] = sum;
        }
        for(int j =0;j<3;j++) {
            sum =0;
            for(int i =0;i<3;i++)
                sum = sum + a[i][j];
            b[3][j] = sum;
        }
        for(int i=0;i<3;i++)
            b[3][3]=b[i][3]+b[3][3];
         System.out.println("The sum matrix is");
        for(int i=0;i<4;i++) {
            for(int j=0;j<4;j++)
                System.out.print(b[i][j]+" ");
            System.out.println();
        }
    }
}
