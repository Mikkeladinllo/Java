import java.util.Scanner;

public class EventDemo 
{
        public static void main(String[] args) 
        {
        	
        	System.out.println("**********************************************");
        	System.out.println('\n'+"Carly's makes the food that makes it a party.");
        	System.out.println('\n'+"**********************************************");
        		
                Event event1 = new Event();
                Event event2=new Event();
                Event event3= new Event();
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter Event 1 number: ");
               event1. setEventNumber(scanner.next());
                System.out.print("Enter Number of Guests: ");
              event1.setNoOfGuests(scanner.nextInt());
              scanner.nextLine();
              System.out.print("Enter Event 2 number: ");
              event2. setEventNumber(scanner.next());
               System.out.print("Enter Number of Guests: ");
             event2.setNoOfGuests(scanner.nextInt());
             scanner.nextLine();
             System.out.print("Enter Event 3 number: ");
             event3. setEventNumber(scanner.next());
              System.out.print("Enter Number of Guests: ");
            event3.setNoOfGuests(scanner.nextInt());
            scanner.nextLine();
             displayDetails(event1);
             displayDetails(event2);
             displayDetails(event3);
             System.out.println("diplaying larger event: ");
           displayDetails ( larger(event1,event2));
             displayDetails(larger(event1,event3));
            displayDetails( larger(event2,event3));
        }
       
        public static void displayDetails(Event event)
        {
        	System.out.println(" Event number: "+event.getEventNumber()+" Number of guests: " +event.getNoOfGuests()+" price: " +event.getEventPrice());
        	
   
        }
        public static Event larger(Event e1,Event e2) {
        	Event event = new Event();
       if(e1.getNoOfGuests()>e2.getNoOfGuests()) {	
    	   event = e1;
       }
    	   else {
    		   event= e2;
      
        }
        return event;
}
}
