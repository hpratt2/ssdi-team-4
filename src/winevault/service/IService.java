package winevault.service;
import java.sql.*;
import java.util.ArrayList;

import winevault.model.Wine;

public interface IService {
	
	
	ResultSet getsortby_Rating();
	ResultSet getsortby_NameAscending();
	ResultSet getsortby_NameDescending();
	ResultSet getsortby_PriceAscending();
	ResultSet getsortby_PriceDescending();
	ArrayList<Wine> getWineList();
	
}
