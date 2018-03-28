package winevault.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import winevault.model.Wine;

public class DAO implements IDAO {
	
	ArrayList<Wine> wines = new ArrayList();
	ResultSet rs;
	
	DAO()

	public ResultSet sortby_Rating() {
		String query="SELECT * FROM wines ORDER BY rating DSC";
		rs= stmt.executeQuery(query);
		return rs;
	}

	@Override
	public ResultSet sortby_NameAscending() {
		String query="SELECT * FROM wines ORDER BY name ASC";
		rs= stmt.executeQuery(query);
		return rs;
	}

	@Override
	public ResultSet sortby_NameDescending() {
		String query="SELECT * FROM wines ORDER BY name DSC";
		rs= stmt.executeQuery(query);
		return rs;
	}

	@Override
	public ResultSet sortby_PriceAscending() {
		String query="SELECT * FROM wines ORDER BY price ASC";
		rs= stmt.executeQuery(query);
		return rs;
	}

	@Override
	public ResultSet sortby_PriceDescending() {
		String query="SELECT * FROM wines ORDER BY price DSC";
		rs= stmt.executeQuery(query);
		return rs;
	}
	@Override
	public ArrayList<Wine> getWineList() {
		String query = "SELECT * FROM wines ORDER BY id";
		rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			wines.add(Wine(rs.getInt("id"),rs.getString("name"),rs.getString(columnIndex) ))
			
		}
		return null;
	}


}
