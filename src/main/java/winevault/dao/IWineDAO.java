package main.java.winevault.dao;

import java.util.List;

import main.java.winevault.model.IWine;

public interface IWineDAO {
	public void addWine(IWine wine);
	public List<IWine> getWineList();
	public List<IWine> getWineListBy(String field, String sortOrder);
}
