package main.java.winevault.service;

import java.util.List;


import main.java.winevault.dao.WineDAO;
import main.java.winevault.model.IWine;
import main.java.winevault.util.ConnectionData;

public class WineListService {
	WineDAO dao = new WineDAO(new ConnectionData());
	
	public List<IWine> getWineList(){
		return dao.getWineList();
	}
	
	public List<IWine> gineWineListBy(String field, String sortOrder){
		return dao.getWineListBy(field,sortOrder);
	}
}
