package testing;

public class Cinema{
	
	private String[] movielist=new String[]{"Batman"};
	private int noOfScreens=1;
    private int ticketsAvailable=50;
    
    
    public Cinema()
    {
  
    }
    
    public String[] getMovielist()
    {
    	return movielist;
    }
    
    public double getPrice(String person)
    {
    	double price=0.0;
    	if(person=="Adult")
    		price=6.00;
    	if(person=="Child")
    		price=4.00;
    	if(person=="Student")
    		price= 5.00;
    	return price;
    }
    
    public String printReceipt(Double priceIn)
    {
    	return "Price: "+priceIn+ "Movie: "+movielist[0];
    }
    
    
    public Boolean buyTicket(String person) throws Exception
    {
    	double price=getPrice(person);
    	if(ticketsAvailable>0)
    	{
    		printReceipt(price);
    		ticketsAvailable--;
    		return true;
    	}
    	else
    	{
    		throw new Exception();
    	}
    }
}

