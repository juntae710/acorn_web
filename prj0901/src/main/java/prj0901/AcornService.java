package prj0901;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao = new AcornDAO(); 
	
	public ArrayList<String> getMemberList(){
		ArrayList<String> list = new ArrayList<>();
		list.add("곽단야");
		list.add("김현수");
		list.add("표준태");
		
		return list;
	}
	
	public ArrayList<String> getMemberRealList(){
		//전체 조회하기
		ArrayList<String> list = dao.selectAll();
		
		return list;
		
	}
	public void registerMember(Customer c) {
		//새로만들기, 등록하기
		dao.insertMember3(c);
	}
	
	public Customer getMember (String id) {
		//하나만찾기, 조회하기
		Customer c = dao.selectOne(id);
		return c;
	}
	
	public void deleteMember(String id) {
		//삭제하기
		dao.deleteOne(id);
	}
	
	public void modifyMember(Customer c) {
		//수정하기 업데이트하기
		dao.updateMember(c);
	}
}
