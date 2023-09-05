package pkprj;

import java.util.ArrayList;


public class Pk_Service {
	
	Pk_DAO dao = new Pk_DAO(); 
	
	public ArrayList<String> selectAll(){
		//전체 조회하기
		ArrayList<String> list = dao.selectAll();
		
		return list;
		
	}
	public void registerMember(Pk p) {
		//새로만들기, 등록하기
		dao.insertMember3(p);
	}
	
	public Pk selectOne (String id) {
		//하나만찾기, 조회하기
		Pk p = dao.selectOne(id);
		return p;
	}
	
	public void deleteOne(String id) {
		//삭제하기
		dao.deleteOne(id);
	}
	
	public void modifyMember(Pk p) {
		//수정하기 업데이트하기
		dao.updateMember(p);
	}
}