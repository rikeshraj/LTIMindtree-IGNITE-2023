import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[]args) throws Exception { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the event name");
        String eventName = br.readLine();
        System.out.println("Enter the hall name");
        String hallName = br.readLine();
        System.out.println("Enter the start date(dd/MM/yyyy)");
        String startDate = br.readLine();
        System.out.println("Enter the end date(dd/MM/yyyy)");
        String endDate = br.readLine();
        System.out.println("Enter the no of people");
        int noOfPeople = Integer.parseInt(br.readLine());
        
        Event e = new Event();
        e.setEventName(eventName);
        e.setHallName(hallName);
        e.setStartDate(startDate);
        e.setEndDate(endDate);
        e.setNoOfPeople(noOfPeople);

        displayDetails(e);
        e.display();
        br.close();
    }

    static void displayDetails(Event e) {
        System.out.println("Inside Static Method\nEvent Name: " + e.getEventName());
        System.out.println("Hall Name: " + e.getHallName());
        System.out.println("Start Date: " + e.getStartDate());
        System.out.println("End Date: " + e.getEndDate());
        System.out.println("No of People: " + e.getNoOfPeople());
    }
}
    
