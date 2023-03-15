public class Event {
	String eventName, hallName, startDate, endDate;
	int noOfPeople;

	void display() {
		System.out.println("Inside Non-Static Method\nEvent Name: " + eventName);
		System.out.println("Hall Name: " + hallName);
		System.out.println("Start Date: " + startDate);
		System.out.println("End Date: " + endDate);
		System.out.println("No of People: " + noOfPeople);
	}

	void setEventName(String eventName) {
		this.eventName = eventName;
	}
	String getEventName() {
		return eventName;
	}

	void setHallName(String hallName) {
		this.hallName = hallName;
	}
	String getHallName() {
		return hallName;
	}

	void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	String getStartDate() {
		return startDate;
	}

	void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	String getEndDate() {
		return endDate;
	}

	void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	int getNoOfPeople() {
		return noOfPeople;
	}	
}
