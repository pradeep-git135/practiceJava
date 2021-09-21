package collections;

import java.util.TreeMap;

public class DemoTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TreeMap tm = new TreeMap();
		tm.put(10, 100);
		tm.put(20, 200);
		tm.put(30, 300);
		tm.put(40, 400);
		
		tm.put(30, 300);
		tm.put(40, 400);
		
		tm.put(1, "hello");
		
//		tm.put(null, 600);// java.lang.NullPointerException
		tm.put(01, null);
		System.out.println(tm);
	}

}
