package winevault.api;
import java.sql.*;
import java.util.ArrayList;

import winevault.model.Wine;

public interface IController {
	
	
	ResultSet getsortby_Rating();
	ResultSet getsortby_NameAscending();
	ResultSet getsortby_NameDescending();
	ResultSet getsortby_PriceAscending();
	ResultSet getsortby_PriceDescending();
	ArrayList<Wine> getWineList();
	
	
}
