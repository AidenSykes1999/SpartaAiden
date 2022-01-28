package codekata;

import java.util.HashMap;
import java.util.Map;

public class VowelCounter {

    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog";
        int numVowels = 0;
        for (int c = 0; c < input.length(); c++) {
            if (input.charAt(c) == 'a' || input.charAt(c) == 'e' || input.charAt(c) == 'i'
                    || input.charAt(c) == 'o' || input.charAt(c) == 'u'){
                numVowels ++ ;
                System.out.println("Number of Vowels: " + numVowels);
            }

        }

    }
}