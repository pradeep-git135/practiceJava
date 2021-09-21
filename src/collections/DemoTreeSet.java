package collections;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 TreeSet ts = new TreeSet<Object>();
		 ts.add(10);
		 ts.add(2);
		 ts.add(30);
		 ts.add(30);
		 System.out.println(ts);
//		 ts.add("hello");   // java.lang.ClassCastException:
//		 ts.add(null);
		 System.out.println(ts);
		System.out.println(ts.descendingSet()); 
		 

	}

}
