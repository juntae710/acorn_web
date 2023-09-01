package prj0831;

import java.util.ArrayList;

public class MV_S {
	public ArrayList<MV> getList(){
		ArrayList<MV> list = new ArrayList<>();
		list.add(new MV("엘리멘탈", 150, "에니매이션"));
		list.add(new MV("밀수", 180, "액션,코미디"));
		list.add(new MV("타겟", 150, "스릴러"));
		
		return list;
	}

}
