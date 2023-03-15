import java.text.*;

public class ItemType {
	private String name;
	private double costPerDay, deposit;
	
	DecimalFormat df = new DecimalFormat("0.00");
	
	public void display(){
		System.out.println("Item type details\nName : " + name);
		System.out.println("CostPerDay : " + df.format(costPerDay));
		System.out.println("Deposit : " + df.format(deposit));
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setCostPerDay(double costPerDay){
		this.costPerDay = costPerDay;
	}
	public double getCostPerDay(){
		return this.costPerDay;
	}
	public void setDeposit(double deposit){
		this.deposit = deposit;
	}
	public double getDeposit(){
		return this.deposit;
	}
}
