package prj0831;

public class MV {
String 제목;
int 상영시간;
String 장르;
public MV(String 제목, int 상영시간, String 장르) {
	super();
	this.제목 = 제목;
	this.상영시간 = 상영시간;
	this.장르 = 장르;
}
@Override
public String toString() {
	return "MV [제목=" + 제목 + ", 상영시간=" + 상영시간 + ", 장르=" + 장르 + "]";
}
public String get제목() {
	return 제목;
}
public void set제목(String 제목) {
	this.제목 = 제목;
}
public int get상영시간() {
	return 상영시간;
}
public void set상영시간(int 상영시간) {
	this.상영시간 = 상영시간;
}
public String get장르() {
	return 장르;
}
public void set장르(String 장르) {
	this.장르 = 장르;
}


}
