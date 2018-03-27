package winevault.model;

public class Wine implements IWine {

	int id;
	String name;
	String country;
	double rating;
	double price_high;
	double price_low;
	
	Wine(int id, String name, String country, double rating, double price_l, double price_h){
		this.id=id;
		this.name=name;
		this.country=country;
		this.rating=rating;
		this.price_low=price_l;
		this.price_high=price_h;
	}
	
	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
		
	}

	@Override
	public String getCountry() {
		// TODO Auto-generated method stub
		return country;
	}

	@Override
	public void setCountry(String country) {
		// TODO Auto-generated method stub
		this.country=country;
	}

	@Override
	public double getRating() {
		// TODO Auto-generated method stub
		return rating;
	}

	@Override
	public void setRating(double rating) {
		// TODO Auto-generated method stub
		this.rating=rating;
		
	}

	@Override
	public double getPrice_Low() {
		// TODO Auto-generated method stub
		return price_low;
	}

	@Override
	public void setPrice_Low(double price_l) {
		// TODO Auto-generated method stub
		this.price_low=price_l;
		
	}

	@Override
	public double getPrice_High() {
		// TODO Auto-generated method stub
		return this.price_high;
	}

	@Override
	public void setPrice_High(double price_h) {
		// TODO Auto-generated method stub
		this.price_high=price_h;
	}
	
	

}