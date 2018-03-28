package winevault.api;
import static org.mockito.Mockito.*;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import winevault.model.IWine;
import winevault.model.Wine;
import winevault.service.WineListingService;

class WineListingControllerTest extends WineListingController {
	
	
	List<IWine> test = new ArrayList<IWine>();
	Wine w1 = new Wine(1,"White Blend", "Italy", 87.00, 10.00, 12.00);
	Wine w2 = new Wine(2,"Portuguese Red", "Portugal", 87.00, 15.00, 15.00);
	Wine w3 = new Wine(3,"Pinot Gris", "US", 87.33, 14.00, 27.00);
	
	
	

	@Test
	void testGetWineList() {
		test.add(w1);
		test.add(w2);
		test.add(w3);
		
		WineListingService wls = mock(WineListingService.class);
		when(wls.getWineList()).thenReturn(test);
		
		WineListingController cont = new WineListingController();
		List<IWine> returned = cont.getWineList();
		
		assertEquals(w1,returned.get(0));
		assertEquals(w2,returned.get(1));
		assertEquals(w3,returned.get(2));
		
		
	}

	@Test
	void testGetSortedWineList() {
		test.add(w1);
		test.add(w2);
		test.add(w3);
		
		WineListingService wls = mock(WineListingService.class);
		when(wls.getSortedWineList(null, null)).thenReturn(test);
		
		WineListingController cont = new WineListingController();
		List<IWine> returned = cont.getSortedWineList(null, null);
		
		assertEquals(w1,returned.get(0));
		assertEquals(w2,returned.get(1));
		assertEquals(w3,returned.get(2));
	}

}
