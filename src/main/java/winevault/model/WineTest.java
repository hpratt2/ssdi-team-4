package main.java.winevault.model;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

class WineTest extends Wine {

	
		
		Wine wineTest = new Wine(1, "N", "C", 10.0, 1, 2);

		@Test
		void testWine() {
			Wine wineTest = new Wine(1, "N", "C", 10.0, 1, 2);
			assertEquals(1,wineTest.getID());
			assertEquals("N",wineTest.getName());
			assertEquals("C",wineTest.getCountry());
			assertEquals(10.0,(double)wineTest.getAvgRating());
			assertEquals(1,(double)wineTest.getPriceLow());
			assertEquals(2,(double)wineTest.getPriceHigh());
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
			assertEquals("name",wineTest.getName());
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
			assertEquals("US",wineTest.getCountry());
			
			//fail("Not yet implemented");
		}

		@Test
		void testGetRating() {
			assertEquals(10.0,(double)wineTest.getAvgRating());
			//fail("Not yet implemented");
		}

		@Test
		void testSetRating() {
			wineTest.setAvgRating(5.0);
			assertEquals(5.0,(double)wineTest.getAvgRating());
			//fail("Not yet implemented");
		}

		@Test
		void testGetPrice_Low() {
			assertEquals(1,(double)wineTest.getPriceLow());
			//fail("Not yet implemented");
		}

		@Test
		void testSetPrice_Low() {
			wineTest.setPriceLow(5.5);
			assertEquals(5.5,(double)wineTest.getPriceLow());
			//fail("Not yet implemented");
		}

		@Test
		void testGetPrice_High() {
			assertEquals(2,(double)wineTest.getPriceHigh());
			//fail("Not yet implemented");
		}

		@Test
		void testSetPrice_High() {
			wineTest.setPriceHigh(6.5);
			assertEquals(6.5,(double)wineTest.getPriceHigh());
			//fail("Not yet implemented");
		}

	}

