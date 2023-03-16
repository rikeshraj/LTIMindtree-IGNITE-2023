//Celsius to Fahrenheit Converter

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Temperature in Celsius:");
        float x = sc.nextFloat();
        float f = ((x*9)/5)+32;
        System.out.printf("Temperature in Fahrenheit is %.1fF",f);
        sc.close();
     }
}
