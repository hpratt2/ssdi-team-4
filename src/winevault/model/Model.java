package winevault.model;

import java.sql.ResultSet;

import winevault.api.Controller;

public class Model implements IModel {

	Controller control;
	private ResultSet rs = control.getsortby_Rating();
	
	
	@Override
	public char[] getName() {
		
		return null;
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub

	}

	@Override
	public char[] getCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCountry() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getRating() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setRating() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPrice_High() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice_High() {
		// TODO Auto-generated method stub

	}

	@Override
	public double getPrice_Low() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setPrice_Low() {
		// TODO Auto-generated method stub

	}

	

}
