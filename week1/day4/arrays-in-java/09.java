//Stock span

import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        int count;
        for(int i=0; i<n; i++) {
            count = 1;
            for(int j=i-1; (j>=0) && (arr[i]>=arr[j]); j--)
                    count++;
            System.out.println(count);
        }
    }
}

