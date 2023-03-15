public class Ticket {
	private int ticketid, price;
	private static int totalnooftickets;

	int Calculatetotalamount(int nooftickets) {
		if(totalnooftickets-nooftickets<0)
			return -1;
		totalnooftickets -= nooftickets;
		return nooftickets*price; 
	}

	void setTicketId(int ticketid) {
		this.ticketid = ticketid;
	}
	int getTicketId() {
		return ticketid;
	}

	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	
	void setTotalNoOfTickets(int totalnooftickets) {
		this.totalnooftickets = totalnooftickets;
	}
	int getTotalNoOfTickets() {
		return totalnooftickets;
	}
	
}
