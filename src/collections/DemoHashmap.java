package collections;

import java.util.HashMap;

public class DemoHashmap {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, 100);
		hm.put(20, 200);
		hm.put(30, 300);
		hm.put(40, 400);
		
		hm.put(10, 500);  //override the previous value
		
		hm.put(25, 500);
		
		hm.put(null, "abc");
		hm.put("abc",null);
		hm.put('c',null);
		
		hm.put(null, "def");

		
		System.out.println(hm);
	}

}
