package movie_0906;

public class movie {
String name;
String time;
public movie(String name, String time) {
	super();
	this.name = name;
	this.time = time;
}

public movie() {
	// TODO Auto-generated constructor stub
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

@Override
public String toString() {
	return "movie [name=" + name + ", time=" + time + "]";
}


}
