package winevault.service;

import java.util.List;
import winevault.dao.WineDAO;
import winevault.model.IWine;
import winevault.util.ConnectionData;

public class WineListingService {
	
	public WineListingService() { }
	
	public List<IWine> getWineList(){
		WineDAO dao = new WineDAO(new ConnectionData());
		return dao.getWineList();
	}

	public List<IWine> getSortedWineList(String sort, String dir) {
		// TODO Auto-generated method stub
		WineDAO dao = new WineDAO(new ConnectionData());
		return dao.getSortedWineList(sort,dir);
	}
}
