package prj0901.goods;

import java.util.ArrayList;

import prj0901.Customer;

public class goods_Service {
goods_DAO dao = new goods_DAO();

public ArrayList<String> selectAll(){
	//전체 조회하기
	ArrayList<String> list = dao.selectAll();
	
	return list;
	
}
public void insertgoods(goods g) {
	//새로만들기, 등록하기
	dao.insertgoods(g);
}

public goods selectOne (String id) {
	//하나만찾기, 조회하기
	goods g = dao.selectOne(id);
	return g;
}

public void deleteOne(String id) {
	//삭제하기
	dao.deleteOne(id);
}

public void updategoods(goods g) {
	//수정하기 업데이트하기
	dao.updategoods(g);
}
}
