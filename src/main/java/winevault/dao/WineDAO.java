package winevault.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import winevault.model.IWine;
import winevault.model.Wine;
import winevault.util.ConnectionUtil;
import winevault.util.IConnectionData;

public class WineDAO implements IWineDAO {
	private IConnectionData connData;
	
	public WineDAO(IConnectionData connData) {
		this.connData = connData;
	}
	
	@Override
	public void addWine(IWine wine) {
		Connection conn = null;
		PreparedStatement statement = null;
		try {
			conn = ConnectionUtil.getConnection(connData);
			String sql = "INSERT INTO wines (variety) values (?)";
			statement = conn.prepareStatement(sql);
			statement.setString(1, wine.getName());
			statement.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public List<IWine> getWineList() {
		return getWineListBy("avgrating","ASC");
	}
	
	@Override
	public List<IWine> getWineListBy(String field, String sortOrder) {
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		List<IWine> wines = new ArrayList<IWine>();
		
		try {
			conn = ConnectionUtil.getConnection(connData);
			String sql = "SELECT * FROM wines ORDER BY ? ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, field);
			statement.setString(2, sortOrder);
			rs = statement.executeQuery();
			while(rs.next()) {
				wines.add(new Wine(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getDouble(4),
						rs.getDouble(5),
						rs.getDouble(6)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return wines;
	}
}
