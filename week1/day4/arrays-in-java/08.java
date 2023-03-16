//Range minimum query

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int L = sc.nextInt();
            int R = sc.nextInt();
            int min = nums[L-1];
            for (int j = L; j <= R; j++) {
                if (nums[j-1] < min) {
                    min = nums[j-1];
                }
            }
            System.out.println(min);
        }
    }
}
