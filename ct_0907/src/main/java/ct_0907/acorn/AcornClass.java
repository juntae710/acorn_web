package ct_0907.acorn;

public class AcornClass {
String id;
String pw;
String name;

public AcornClass() {
	// TODO Auto-generated constructor stub
}

public AcornClass(String id, String pw, String name) {
	super();
	this.id = id;
	this.pw = pw;
	this.name = name;
}



@Override
public String toString() {
	return "AcornClass [id=" + id + ", pw=" + pw + ", name=" + name + "]";
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
