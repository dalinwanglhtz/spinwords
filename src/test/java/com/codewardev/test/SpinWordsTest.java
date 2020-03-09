package com.codewardev.test;

import org.junit.Test;

import com.codewardev.SpinWords;

import static org.junit.Assert.assertEquals;

public class SpinWordsTest {
    @Test
    public void test() {
      assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
      assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
    
}
