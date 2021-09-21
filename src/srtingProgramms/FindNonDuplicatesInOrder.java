package srtingProgramms;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class FindNonDuplicatesInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// TODO Auto-generated method stub
			String s = "killer";
            LinkedHashSet<Character> set = new LinkedHashSet<Character>();
			for (int i = 0; i < s.length(); i++) {
				set.add(s.charAt(i)) ;
			}
			for (Character ch : set) {
				int count = 0;
				for (int i = 0; i < s.length(); i++) {
					if (ch == s.charAt(i)) {
						count++;                           //if it matches increment the count value
					}
				}
				if (count==1) {
					System.out.print(ch);       //print char and count
				}
				
			}


	}

}
