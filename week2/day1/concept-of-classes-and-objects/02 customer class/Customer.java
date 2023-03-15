public class Customer {
	 private String customerName, customerEmail, customerType, customerLocation;
	
	Customer(String customerName, String customerEmail, String customerType, String customerLocation) {
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.customerType = customerType;
		this.customerLocation = customerLocation;
	}

    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getCustomerType() {
        return customerType;
    }
    public String getCustomerLocation() {
        return customerLocation;
    }
}
