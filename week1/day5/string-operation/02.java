//Converting Text to SMS Language

import java.io.*;
import java.text.*;
public class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inp = br.readLine();
        inp = inp.replaceAll("yes", "s");
        inp = inp.replaceAll("you", "u");
        inp = inp.replaceAll("today", "2day");
        inp = inp.replaceAll("why", "y");
        System.out.println(inp);
        br.close();
    }
}
