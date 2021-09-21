package srtingProgramms;

import java.util.HashSet;

public class NumOfOccuranceOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wellcome to testYantra";
		
		String[] str = s.split(" ");
		
		HashSet<String> set = new HashSet<String>();
		
		for (String item : str) {
			set.add(item);
		}
		
		for (String word : set) {
			int count = 0;
			for (String ele : str) {
				if (word.equalsIgnoreCase(ele)) {
					count++;
				}
			}
			System.out.println(word + ":"+ count);
			
		}

	}

}
