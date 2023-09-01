package prj0831;

import java.util.ArrayList;

public class bucketList_S {

	public ArrayList<bucketList> getList() {
		ArrayList<bucketList> b = new ArrayList<>();
		b.add(new bucketList("건물주되기", "죽기전", "중"));
		b.add(new bucketList("컴퓨터맞추기", "30살전까지", "상"));
		b.add(new bucketList("고오급개발자되기", "35살전까지", "상"));
		b.add(new bucketList("사업하기", "40살전까지", "상"));
		b.add(new bucketList("일안하고돈벌기", "죽기전까지", "중"));

		return b;
	}
}
