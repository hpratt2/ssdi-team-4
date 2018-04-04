package winevault.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Thing {
	private String name;
	private String num;
	
	public Thing () {
		name = "name";
		num = "num";
	}
	
	public String getName() { return name; }
	
	public String getNum() { return num; }
	@Override
	public String toString() {
		return "[name="+name+",num="+num+"]";
	}
}