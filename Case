import java.util.Scanner;
public class EventDemo 
{

	public static void main(String[] args) 
	{
		int guest;
		String events;
		Event obj= new Event();
		Event obj2= new Event();
		obj.Event();
		obj2.Event(numEvents(),numGuest());
	System.out.println(	obj2.getEventNumber());
		guest = numGuest();//calling the method
		events = numEvents();//calling the method
		displayMotto();//calling the method
		displayDetails(guest);//calling the method
		System.out.println("The event number is: " + events);
	}

	

	public static int numGuest()
	{
		int guest; 
		System.out.println("How many guest are in the party: ");
		Scanner inputDevice = new Scanner(System.in);
		guest = inputDevice.nextInt();
		
		return guest; 
	}
	
	public static String numEvents()
	{
		String events; 
		System.out.println("What is the event number: ");
		Scanner inputDevice = new Scanner(System.in);
		events = inputDevice.next();
		System.out.println(events);
		return events; 
	}
	
	public static void displayMotto()
	{
		System.out.println("**********************************************");
		System.out.println('\n'+"Carly's makes the food that makes it a party.");
		System.out.println('\n'+"**********************************************");
	}
	
	public static void displayDetails(int guest)
	{
		final double price = 35.00;
		final int maxGuest = 50;
		double ammount;
		boolean tooMuch = false;
		tooMuch = guest >= maxGuest;
		System.out.println("The amount of guest are: " + guest); 
		System.out.println("The price per guest is: "+ price);
		
		ammount = price * guest;
		System.out.println("The ammount of money: " + ammount); 
		System.out.println("This party is too large: " + tooMuch);
	}
}
