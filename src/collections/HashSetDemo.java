package collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(30);
		System.out.println(hs);
		hs.add("hello");
		hs.add(null);
		

	}

}
