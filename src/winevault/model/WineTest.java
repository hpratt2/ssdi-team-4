package winevault.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WineTest {
	
	Wine wineTest = new Wine(1, "N", "C", 10.0, 1, 2);

	@Test
	void testWine() {
		Wine wineTest = new Wine(1, "N", "C", 10.0, 1, 2);
		assertEquals(1,wineTest.id);
		assertEquals("N",wineTest.name);
		assertEquals("C",wineTest.country);
		assertEquals(10.0,wineTest.rating);
		assertEquals(1,wineTest.price_low);
		assertEquals(2,wineTest.price_high);
		//fail("FAILLLL");
	}

	@Test
	void testGetID() {
		
		assertEquals(1,wineTest.getID());
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetName() {
		
		assertEquals("N",wineTest.getName());
		//fail("Not yet implemented");
	}

	@Test
	void testSetName() {
		wineTest.setName("name");
		assertEquals("name",wineTest.name);
		//fail("Not yet implemented");
	}

	@Test
	void testGetCountry() {
		assertEquals("C",wineTest.getCountry());
		//fail("Not yet implemented");
	}

	@Test
	void testSetCountry() {
		wineTest.setCountry("US");
		assertEquals("US",wineTest.country);
		
		//fail("Not yet implemented");
	}

	@Test
	void testGetRating() {
		assertEquals(10.0,wineTest.getRating());
		//fail("Not yet implemented");
	}

	@Test
	void testSetRating() {
		wineTest.setRating(5.0);
		assertEquals(5.0,wineTest.rating);
		//fail("Not yet implemented");
	}

	@Test
	void testGetPrice_Low() {
		assertEquals(1,wineTest.getPrice_Low());
		//fail("Not yet implemented");
	}

	@Test
	void testSetPrice_Low() {
		wineTest.setPrice_Low(5.5);
		assertEquals(5.5,wineTest.price_low);
		//fail("Not yet implemented");
	}

	@Test
	void testGetPrice_High() {
		assertEquals(2,wineTest.getPrice_High());
		//fail("Not yet implemented");
	}

	@Test
	void testSetPrice_High() {
		wineTest.setPrice_High(6.5);
		assertEquals(6.5,wineTest.price_high);
		//fail("Not yet implemented");
	}

}
