package winevault.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import winevault.model.IWine;
import winevault.model.Wine;
import winevault.util.*;

public class WineDAO implements IWineDAO{
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
	public List<IWine> getWineList(){
		Connection conn = null;
		Statement statement = null;
		ResultSet rs = null;
		List<IWine> wines = new ArrayList<IWine>();
		try {
			conn = ConnectionUtil.getConnection(connData);
			String sql = "SELECT * FROM wines";
			statement = conn.createStatement();
			rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				wines.add(new Wine(rs.getInt(0), rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getDouble(4), rs.getDouble(5)));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return wines;
	}

	public List<IWine> getSortedWineList(String sort, String dir) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement statement = null;
		ResultSet rs = null;
		List<IWine> wines = new ArrayList<IWine>();
		try {
			conn = ConnectionUtil.getConnection(connData);
			String sql = "SELECT * FROM wines SORT BY ? ?";
			statement = conn.prepareStatement(sql);
			statement.setString(1, sort);
			statement.setString(2, dir);
			rs = statement.executeQuery();
			
			while(rs.next()) {
				wines.add(new Wine(rs.getInt(0),rs.getString(1),rs.getString(2),rs.getDouble(3),rs.getDouble(4),rs.getDouble(5)));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return wines;
	}
}
