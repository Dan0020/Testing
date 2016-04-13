package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyTest {
	Cinema cinema=new Cinema();
	
	@Test
	public void testGetMovieList() {
		
		String[] expectedArray = {"Batman"};
		String[] result =cinema.getMovielist();
		assertArrayEquals(expectedArray, result);
    }
	
	@Test
	public void testGetPrice() {
		double result=cinema.getPrice("Adult");
		assertEquals(6.00,result,0.0);
    }
	
	@Test
	public void testGetPriceChild() {
		double result=cinema.getPrice("Child");
		assertEquals(4.00,result,0.0);
    }

	@Test
	public void testBuyTicketBoolean() throws Exception
	{
		assertTrue (cinema.buyTicket("Adult"));
	}
	
	@Test(expected = Exception.class)
	public void testButTicketException() throws Exception {
		for(int i=0;i<=60;i++)
		{
			cinema.buyTicket("Adult");
		}
	}

}
