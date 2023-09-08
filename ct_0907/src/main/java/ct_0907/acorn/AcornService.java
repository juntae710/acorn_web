package ct_0907.acorn;

import java.util.ArrayList;

public class AcornService {

	public ArrayList<AcornClass> selectAll() {
		AcornDAO a = new AcornDAO();
		ArrayList<AcornClass> list = a.selectAll();

		return list;

	}
}
