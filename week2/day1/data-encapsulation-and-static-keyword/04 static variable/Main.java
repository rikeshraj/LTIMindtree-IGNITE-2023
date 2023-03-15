import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[]args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name");
		String name = br.readLine();
		System.out.println("Enter the accountType [Current , Savings, Demat]");
		String account = br.readLine();
		System.out.println("Enter the balance");
		double balance = Double.parseDouble(br.readLine());
		Customer customer = new Customer(name, account, balance);
		while(true) {
			System.out.println("Enter 1 to deposit an amount 2 to withdraw an amount 3 to exit");
			int choice = Integer.parseInt(br.readLine());
			if(choice==1) {
				System.out.println("Enter the amount to deposit");
				double amount = Double.parseDouble(br.readLine());
				customer.deposit(amount);
			}
			else if(choice==2) {
				System.out.println("Enter the amount to withdraw");
				double amount = Double.parseDouble(br.readLine());
				customer.withdrawal(amount);
			}
			else if(choice==3) {
				break;
			}
		}
		System.out.println("Number of Transactions done : " + customer.getNoOfTransactions());
		br.close();
    }
}
    
