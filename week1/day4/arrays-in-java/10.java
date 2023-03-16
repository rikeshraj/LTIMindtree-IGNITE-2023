//Sort by shift

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = sc.nextInt();
            b[i]=a[i];
        }
        Arrays.sort(b);
        int count=0;
        boolean f =false;
        for(int i= 0 ;i<n-1;i++) {  
            if(Arrays.equals(b,a)) {
                System.out.print(count);
                break;
            }
            int x = a[n-1];
            for(int j = n-1;j>0;j--)
                a[j] = a[j-1];
            count++;
            a[0] = x;
            if(Arrays.equals(b,a)) {
                System.out.print(count);
                f = true;
                break;
            }
        }
        if(count>=n-1 && f !=true )
            System.out.print("-1");
    }
}
