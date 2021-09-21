package srtingProgramms;

import java.util.HashSet;

public class NumOfOccurenceOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "INDIA";
		
//		create set and add all charecters into set so that we can get unique charectors
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
	
//		compare each char of set with all chars of given string
		for (Character ch : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (ch == s.charAt(i)) {
					count++;                           //if it matches increment the count value
				}
			}
			System.out.println(ch+ " : "+count);       //print char and count
		}
	}

}
