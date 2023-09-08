package ct_0907.acorn2;

public class a_c {
String id;
String pw;
String name;
public a_c(String id, String pw, String name) {
	super();
	this.id = id;
	this.pw = pw;
	this.name = name;
}

public a_c() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "a_c [id=" + id + ", pw=" + pw + ", name=" + name + "]";
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
