package winevault.model;

public interface IWine {
	
	public int getID();
	
	public String getName();
	public void setName(String name);
	
	public String getCountry();
	public void setCountry(String country);
	
	public double getRating();
	public void setRating(double rating);
	
	public double getPrice_Low();
	public void setPrice_Low(double price_l);
	
	public double getPrice_High();
	public void setPrice_High(double price_h);
	

}
