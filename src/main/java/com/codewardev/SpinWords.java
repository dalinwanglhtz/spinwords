package com.codewardev;

//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

import java.util.Arrays;
import java.util.stream.Collectors;


public class SpinWords {

	public String spinWords(String sentence) {
		return Arrays.stream(sentence.split(" ")).map(x-> {
			return x.length() >= 5 ? new StringBuilder(x).reverse().toString():x;
		}).collect(Collectors.joining(" "));
	}

}
