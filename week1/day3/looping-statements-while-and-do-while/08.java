//Sorted prize

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
 	    int n= sc.nextInt();
       	int m =n,c=0,y=0;
       	boolean x = false;
       	int a= n%10;
       	n= n/10;
       	while(m>0) {
           	m = m/10;
           	c++;
        }
        if(c!=3 || n ==0) {
            x= true;
        }
     	while(n>0) {
            if(a<n%10 ) {
                if(y!=0) {
                    x= true;
   	                break;
       	        } 
               	while(n>0) {
                   	if(a>n%10) {
                       	x= true;
                       	break;
                   	}
                   	a =n%10;
                   	n = n/10;
               	}
           	}
           	if(a!=n%10)
                y=1;
   	        a= n%10;
            n = n/10;
       	}
       	if(x)
           	System.out.println("no");
       	else
           System.out.println("yes");
    }
}

