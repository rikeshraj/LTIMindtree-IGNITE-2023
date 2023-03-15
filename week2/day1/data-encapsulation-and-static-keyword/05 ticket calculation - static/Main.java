import java.io.*;
import java.lang.*;
public class Main{
    public static void main(String[]args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no of objects:");
        int n = Integer.parseInt(br.readLine());
        System.out.println("Enter the Total no of tickets:");
        int t = Integer.parseInt(br.readLine());
        Ticket ticket = new Ticket();
        ticket.setTotalNoOfTickets(t);
        for(int i=0; i<n; i++) {
            System.out.println("Enter the ticketid:");
            ticket.setTicketId(Integer.parseInt(br.readLine()));
            System.out.println("Enter the price:");
            ticket.setPrice(Integer.parseInt(br.readLine()));
            System.out.println("Enter the no of tickets:");
            int noOfTickets = Integer.parseInt(br.readLine());
            if(ticket.getTotalNoOfTickets() < noOfTickets) {
                System.out.println("Total no of tickets: " + ticket.getTotalNoOfTickets());
                System.out.println("Sorry tickets not available.");
                continue;
            }
            System.out.println("Total no of tickets: " + ticket.getTotalNoOfTickets());
            System.out.println("Total amount:" + ticket.Calculatetotalamount(noOfTickets));
            System.out.println("Total no of ticket after booking:" + ticket.getTotalNoOfTickets());
        }
        br.close();
    }
}
    
