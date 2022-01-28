package codekata;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "The quick brown fox jumped over the lazy dog";

        char[] letterList = input.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : letterList)
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println("Duplicate characters:");

        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
            }
        }


    }
}
