package prj0831;

public class bucketList {

String 목표;
String 기한;
String 중요도;



public bucketList() {
	// TODO Auto-generated constructor stub
}


public bucketList(String 목표, String 기한, String 중요도) {
	super();
	this.목표 = 목표;
	this.기한 = 기한;
	this.중요도 = 중요도;
}
@Override
public String toString() {
	return "bucketList [목표=" + 목표 + ", 기한=" + 기한 + ", 중요도=" + 중요도 + "]";
}
public String get목표() {
	return 목표;
}
public void set목표(String 목표) {
	this.목표 = 목표;
}
public String get기한() {
	return 기한;
}
public void set기한(String 기한) {
	this.기한 = 기한;
}
public String get중요도() {
	return 중요도;
}
public void set중요도(String 중요도) {
	this.중요도 = 중요도;
}


}
