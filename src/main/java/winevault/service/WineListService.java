package winevault.service;

import java.util.List;

import winevault.dao.WineDAO;
import winevault.model.IWine;
import winevault.util.ConnectionData;

public class WineListService {
	WineDAO dao = new WineDAO(new ConnectionData());
	
	public List<IWine> getWineList(){
		return dao.getWineList();
	}
	
	public List<IWine> gineWineListBy(String field, String sortOrder){
		return dao.getWineListBy(field,sortOrder);
	}
}
