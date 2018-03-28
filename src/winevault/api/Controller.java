package winevault.api;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import winevault.model.Model;
import winevault.model.Wine;
import winevault.service.Service;


public class Controller implements IController {

	Model model;
	Service service;
	View view;
	ArrayList<Wine> wines = new ArrayList();
	ResultSet rs;
	
	
	Controller(Model model, Service service, View view){
		this.model=model;
		this.service=service;
		this.view=view;
	}
	@Override
	public ResultSet getsortby_Rating() {
		rs=service.getsortby_Rating();
		return rs;
	}

	@Override
	public ResultSet getsortby_NameAscending() {
		rs=service.getsortby_NameAscending();
		return rs;
	}

	@Override
	public ResultSet getsortby_NameDescending() {
		rs=service.getsortby_NameDescending();
		return rs;
	}

	@Override
	public ResultSet getsortby_PriceAscending() {
		rs=service.getsortby_PriceAscending();
		return rs;
	}

	@Override
	public ResultSet getsortby_PriceDescending() {
		rs=service.getsortby_PriceDescending();
		return rs;
	}
	@Override
	public ArrayList<Wine> getWineList() {
		wines=service.getWineList();
		return wines;
	}
	

	

}
