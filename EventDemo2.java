import java.util.Scanner;

public class EventDemo2 
{
        public static void main(String[] args) 
        {
                Event event1 = new Event();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Event number: ");
                String eventNumber = scanner.next();
                System.out.print("Enter Number of Guests: ");
                int noOfGuests = scanner.nextInt();
                Event event2 = new Event(eventNumber, noOfGuests);
                
                System.out.println(event1);
                System.out.println(event2);
        }
}
