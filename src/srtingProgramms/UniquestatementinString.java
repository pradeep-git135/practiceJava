package srtingProgramms;

import java.util.HashSet;

public class UniquestatementinString {
	public static void main(String[] args) {
		String s = "welcome to india welcome to mandya";
		String[] str = s.split(" ");
		 HashSet<String> set = new HashSet<String>();
		for (String ele : str) {
			set.add(ele);
		}
		for (String word : set) {
			int count = 0;
			for (String ele : str) {
				if (word.equalsIgnoreCase(ele)) {
					count++;
				}
			}
			if (count==1) {
				System.out.println(word);
			}
			
		}

	}
	
}
