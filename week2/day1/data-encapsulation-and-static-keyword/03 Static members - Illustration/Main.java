import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[]args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Object 1 details\nEnter i1");
        int i1 = Integer.parseInt(br.readLine());
        System.out.println("Enter i2");
        int i2 = Integer.parseInt(br.readLine());
        StaticIllustration si1 = new StaticIllustration();
        si1.setI1(i1);
        si1.setI2(i2);
        System.out.print("Object 1 ");
        si1.displayDetails();

        System.out.println("Enter Object 2 details\nEnter i1");
        i1 = Integer.parseInt(br.readLine());
        System.out.println("Enter i2");
        i2 = Integer.parseInt(br.readLine());
        StaticIllustration si2 = new StaticIllustration();
        si2.setI1(i1);
        si2.setI2(i2);
        System.out.print("Object 2 ");
        si2.displayDetails();
        System.out.print("Object 1 ");
        si1.displayDetails();
        
        br.close();
    }
}
    
