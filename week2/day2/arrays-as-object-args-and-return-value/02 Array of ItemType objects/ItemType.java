public class ItemType {
	private String name;
	private double deposit, costPerDay;

	ItemType() {}

	ItemType(String name, double deposit, double costPerDay) {
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}

	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	double getDeposit() {
		return deposit;
	}
	void setCostPerDay(double costPerDay) {
		this.costPerDay = costPerDay;
	}
	double getCostPerDay() {
		return costPerDay;
	}
}
