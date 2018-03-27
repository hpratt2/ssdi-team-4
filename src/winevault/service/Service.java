package winevault.service;

import java.sql.ResultSet;
import java.util.ArrayList;

import winevault.api.Controller;
import winevault.dao.DAO;
import winevault.model.Wine;

public class Service implements IService {
	
	Controller control;
	DAO data_access;
	ResultSet rs;
	ArrayList<Wine> wines = new ArrayList();
	
	Service(Controller control, DAO data_access){
		this.control=control;
	}

	@Override
	public ResultSet getsortby_Rating() {
		data_access.sortby_Rating();
		return rs;
	}

	@Override
	public ResultSet getsortby_NameAscending() {
		data_access.sortby_NameAscending();
		return rs;
	}

	@Override
	public ResultSet getsortby_NameDescending() {
		data_access.sortby_NameDescending();
		return rs;
	}

	@Override
	public ResultSet getsortby_PriceAscending() {
		data_access.sortby_PriceAscending();
		return rs;
	}

	@Override
	public ResultSet getsortby_PriceDescending() {
		data_access.sortby_PriceDescending();
		return rs;
	}

	@Override
	public ArrayList<Wine> getWineList() {
		data_access.
		return wines;
	}

}
