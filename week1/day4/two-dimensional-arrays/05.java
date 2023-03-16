//Print Matrix in Spiral form

import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] a = new int[n][m];
        for(int i=0;i<n;i++)
            for(int j=0;j<m;j++)
                a[i][j] = sc.nextInt();
        int i,k=0,l=0;
        while(k<n && l<m) {
            for(i=l;i<m;i++)
                System.out.print(a[k][i]+" ");
            k++;
            for(i=k;i<n;i++)
                System.out.print(a[i][m-1]+" ");
            m--;
            if(k<n) {
                for(i=m-1;i>=l;i--)
                    System.out.print(a[n-1][i]+" ");
                n--;
            }
            if(l<m) {
                for(i=n-1;i>=k;i--)
                    System.out.print(a[i][l]+" ");
                l++;
            }
        }
    }
}
