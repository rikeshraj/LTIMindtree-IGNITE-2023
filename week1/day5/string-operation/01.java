//String Reversal

import java.io.*; 
import java.util.*; 
import java.lang.String; 
public class Main{ 
	public static void main(String args[]) { 
		String original,reverse =""; 
		Scanner scan=new Scanner(System.in); 
		System.out.println("Enter a string to reverse"); 
		original=scan.nextLine(); 
		int len=original.length();
		for(int i=len-1;i>=0;i--){ 
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Reverse of the string is "+reverse );
		scan.close();
	}
} 
