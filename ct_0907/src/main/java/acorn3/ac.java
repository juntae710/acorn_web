package acorn3;

public class ac {
String id;
String pw;
String name;

public ac() {
	// TODO Auto-generated constructor stub
}

public ac(String id, String pw, String name) {
	super();
	this.id = id;
	this.pw = pw;
	this.name = name;
}

@Override
public String toString() {
	return "ac [id=" + id + ", pw=" + pw + ", name=" + name + "]";
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getPw() {
	return pw;
}

public void setPw(String pw) {
	this.pw = pw;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
