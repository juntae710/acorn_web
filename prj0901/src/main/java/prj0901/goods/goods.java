package prj0901.goods;

public class goods {
String id;
String name;
String price;

public goods() {
	// TODO Auto-generated constructor stub
}
public goods(String id, String name, String price) {
	super();
	this.id = id;
	this.name = name;
	this.price = price;
}


public goods(String id, String price) {
	super();
	this.id = id;
	this.price = price;
}


@Override
public String toString() {
	return "goods [id=" + id + ", name=" + name + ", price=" + price + "]";
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}



}
