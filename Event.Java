class Event 
{
	//intializing our fields for our getters and setters
	public static final double guestPrice = 35.00;
	public static final int maxGuest = 50;
	private String eventNumber;
	private int numGuest;
	private double price;

//Constructors to set and get variables 
	
	void Event(String eventNumber , int numGuest) {
		setEventNumber(eventNumber);
		setNumGuest(numGuest);
	}
void Event() {
	
	Event("A000",0);
}
public void setEventNumber(String number)
{
	eventNumber = number;
}
public void setNumGuest(int Guest)
{
	numGuest=Guest;
}
public String getEventNumber() 
{
	return eventNumber;
}
public int getNumGuest()
{
	return numGuest;
}
public double getPrice()
{
	return price;
}
}
