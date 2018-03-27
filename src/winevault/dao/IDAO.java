package winevault.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import winevault.model.Wine;

public interface IDAO {
	public ResultSet sortby_Rating();

	public ResultSet sortby_NameAscending();

	public ResultSet sortby_NameDescending();

	public ResultSet sortby_PriceAscending();

	public ResultSet sortby_PriceDescending();
	
	ArrayList<Wine> getWineList();

}
