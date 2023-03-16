//Invalid id number

import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        boolean b=true;
        int c=0;
        String name=null,val=null;
        do {
            String id = sc.nextLine();
            if(sc.hasNextLine()) 
               name = sc.nextLine();
            if(sc.hasNextLine())
                val = sc.nextLine();

            if(id.length()!=4 || name== null || val==null) {
                b = true;
                break; 
            }  
            else if(val.length()!=0 && val.charAt(0)==110 && val.charAt(1)==111) {  
                c++;
                b = true;
                break;
            }
            for(int i=0;i<id.length();i++) {
                if(id.charAt(i)>=48 && id.charAt(i)<=57 && i<id.length()/2)
                    b = false;
                else if(((id.charAt(i)>=65 && id.charAt(i)<=90)|| (id.charAt(i)>=97 && id.charAt(i)<=122) )&& i>=id.length()/2)
                    b =false;
                else {
                    b = true;
                    break;
                }
            }
            if(b==false)
                c++;
            else
                break;
            b = true;
        } while(b);
            System.out.print(c);
    }
}
