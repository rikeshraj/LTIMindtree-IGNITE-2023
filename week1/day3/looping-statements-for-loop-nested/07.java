/*
Print pattern 
~ ~ ~ 
~ * ~ 
~ ~ ~
for n=3
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);    
        int n= scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i == n / 2 + 1 && j == n / 2 + 1){
                    System.out.print("* ");
                }
                else {
                   System.out.print("~ ");
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
