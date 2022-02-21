public class Event2 
{
	public final static int pricePerGuest = 35;
	public final static int largeEventCutOff = 50;
	private String eventNumber;
	private int noOfGuests;
	private double eventPrice;

	public String getEventNumber() 
	{
			return eventNumber;
	}

	public void setEventNumber(String eventNumber) 
	{
			this.eventNumber = eventNumber;
	}

	public int getNoOfGuests() 
	{
			return noOfGuests;
	}

	public void setNoOfGuests(int noOfGuests) 
	{
			this.noOfGuests = noOfGuests;
			double eventPrice = pricePerGuest * noOfGuests;
			setEventPrice(eventPrice);
	}

	public double getEventPrice() 
	{
			return eventPrice;
	}

	public void setEventPrice(double eventPrice) 
	{
			this.eventPrice = eventPrice;
	}

	public Event(String eventNumber, int noOfGuests) 
	{
			super();
			setEventNumber(eventNumber);
			setNoOfGuests(noOfGuests);
	}

	public Event() 
	{
			this("A000", 0);
	}
	
	public String toString() 
	{
			return "Event Default " + eventNumber + ", Default Number of Guest " + noOfGuests + ", Default Price " + eventPrice;
	}
}
