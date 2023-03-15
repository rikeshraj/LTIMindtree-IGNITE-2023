import java.io.*;

class Main{
	public static void main(String[] args) throws Exception{ 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the item type name");
		String name = br.readLine();
		System.out.println("Enter the cost per day");
		double costPerDay = Double.parseDouble(br.readLine());
		System.out.println("Enter the deposit");
		double deposit = Double.parseDouble(br.readLine());

		ItemType it = new ItemType();
		
		it.setName(name);
		it.setCostPerDay(costPerDay);
		it.setDeposit(deposit);

		it.display();
    
    br.close();
	}
}
