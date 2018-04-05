package main.java.winevault.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public interface IWine {
	public int getID();
	public void setID(int id);
	
	public String getName();
	public void setName(String name);
	
	public String getCountry();
	public void setCountry(String country);
	
	public Double getAvgRating();
	public void setAvgRating(Double rating);
	
	public Double getPriceLow();
	public void setPriceLow(Double priceLow);
	
	public Double getPriceHigh();
	public void setPriceHigh(Double priceHigh);
}
