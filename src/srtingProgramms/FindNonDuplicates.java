package srtingProgramms;

import java.util.HashSet;

public class FindNonDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "testyantra";
		HashSet<Character> set = new HashSet<Character>();
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
				System.out.println(ch+ " : "+count);       //print char and count
			}
			
		}
	}



	}


