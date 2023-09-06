package movie_0906;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

public class movieService {
	
	movieDAO dao = new movieDAO();
	

	public JSONArray getMovieList() {
		ArrayList<movie> list = new ArrayList<>();
		list.add(new movie("너의이름은", "180"));
		list.add(new movie("날씨의아이", "220"));
		list.add(new movie("스즈메의문단속", "200"));
		
		JSONArray arr = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			movie f=list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("time", f.getTime());
			
			arr.put(o);
		}
		return arr;
	}
	public JSONArray getMovieRealList() {
		
		ArrayList<movie> list = dao.getmovieList();
		
		JSONArray arr = new JSONArray();
		for(int i=0; i<list.size(); i++) {
			movie f=list.get(i);
			JSONObject o = new JSONObject();
			o.put("name", f.getName());
			o.put("time", f.getTime());
			
			arr.put(o);
		}
		return arr;
	}
}
