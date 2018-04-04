package winevault.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Wine implements IWine {
	private int id;
	private String name, country;
	private Double rating, priceLow, priceHigh;
	
	public Wine() { };
	
	public Wine(int id, String name, String country, double rating, double priceL, double priceH) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.rating = rating;
		this.priceLow = priceL;
		this.priceHigh = priceH;
	}
	
	public int getID() { return id; }
	public void setID(int id) { this.id = id; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public String getCountry() { return country; }
	public void setCountry(String country) { this.country = country; }
	
	public Double getAvgRating() { return rating; }
	public void setAvgRating(Double rating) { this.rating = rating; }
	
	public Double getPriceLow() { return priceLow; }
	public void setPriceLow(Double priceLow) { this.priceLow = priceLow; }
	
	public Double getPriceHigh() { return priceHigh; }
	public Double setPriceHigh(Double priceHigh) { return priceHigh; }
}
