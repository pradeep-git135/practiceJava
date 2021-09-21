package srtingProgramms;

import java.util.LinkedHashSet;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "AMMA";
		LinkedHashSet set = new LinkedHashSet();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Object ch : set) {
			System.out.print(ch);
		}

	}

}
