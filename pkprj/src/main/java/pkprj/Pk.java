package pkprj;

public class Pk {
String id;
String name;
String tel;
String age;
public Pk(String id, String name, String tel, String age) {
	super();
	this.id = id;
	this.name = name;
	this.tel = tel;
	this.age = age;
}

public Pk() {
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Pk [id=" + id + ", name=" + name + ", tel=" + tel + ", age=" + age + "]";
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

public String getTel() {
	return tel;
}

public void setTel(String tel) {
	this.tel = tel;
}

public String getage() {
	return age;
}

public void setage(String age) {
	this.age = age;
}

}
