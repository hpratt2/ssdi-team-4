package winevault.model;

import java.sql.ResultSet;

public interface IModel {
	
	
char[] getName();
void setName();

char[] getCountry();
void setCountry();

double getRating();
void setRating();

double getPrice_High();
void setPrice_High();

double getPrice_Low();
void setPrice_Low();

}
