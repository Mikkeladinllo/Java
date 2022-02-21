public class Event
{
	public final static int HighPPG = 35; //This is where we state the price per guest
	public final static int LowPPG = 32;
	public final static int largeEventCutOff = 50; //This is where we state the guest cut off
	private String eventNumber;
	private int noOfGuests;
	private double eventPrice;

	public String getEventNumber() //Where we get the event number and return the value
	{
			return eventNumber;
	}

	public void setEventNumber(String eventNumber) //Where we get the event number and return the value
	{
			this.eventNumber = eventNumber;
	}

	public int getNoOfGuests() //Where we get the number of guest and return the value
	{
			return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) //Where we set the number of guest and getting the amount of money
	{
		LargeEvent();
		this.noOfGuests = noOfGuests;
		if(LargeEvent())
		{
			double eventPrice = LowPPG * noOfGuests;
			setEventPrice(eventPrice);
		}
		else 
		{
			double eventPrice = HighPPG * noOfGuests;
			setEventPrice(eventPrice);
		}
	}
	
	public boolean LargeEvent()
	{
		boolean tooMuch = false;
    	tooMuch = noOfGuests >= largeEventCutOff;
		return tooMuch;
	}

	public double getEventPrice() //Where we get the event price and return the value
	{
			return eventPrice;
	}

	public void setEventPrice(double eventPrice) //Where we get the event price
	{
			this.eventPrice = eventPrice;
	}

	public Event(String eventNumber, int noOfGuests) //Where we set the event object
	{
			
			setEventNumber(eventNumber);
			setNoOfGuests(noOfGuests);
	}

	public Event() //Where we overload the Event values with default values
	{
			this("A000", 0);
	}
	
	public String toString() //Where we return and display the wording
	{
			return "Event " + eventNumber + ",  Number of Guest " + noOfGuests + ", Price " + eventPrice;
	}
}
