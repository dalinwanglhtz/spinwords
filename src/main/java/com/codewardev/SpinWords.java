package com.codewardev;

//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

import java.util.Arrays;
import java.util.stream.Collectors;


public class SpinWords {

	public String spinWords(String sentence) {
		String[] words = sentence.split(" ");
		String result ="";
		result = Arrays.stream(words).map(x-> {
			if(x.length() >= 5) {
				StringBuilder a = new StringBuilder(x);
				x = a.reverse().toString();
			}
			return x;
		}).collect(Collectors.joining(" "));
		
		System.out.println("Result: "+result);
		
		return result;
	}

}
