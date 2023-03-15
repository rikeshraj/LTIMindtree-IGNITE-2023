import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Name:");
		String name = sc.nextLine();
		System.out.println("Enter Age:");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Country:");
		String country = sc.nextLine();
		
		Player c = new Player();

		c.setName(name);
		c.setAge(age);
		c.setCountry(country);

		System.out.println("Player Details:\nName:" + c.getName());
		System.out.println("Age:" + c.getAge());
		System.out.println("Country:" + c.getCountry());
    sc.close();
  }
}
