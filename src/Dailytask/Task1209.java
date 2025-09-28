package Dailytask;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1209 {
    public static void main(String[] args) {
        String sen ="APJ Abdul kalam was Born and raised in a Muslim family in Rameswaram";
        ArrayList<String> words =new ArrayList<String>();

        String word = "";
        for (int i = 0; i < sen.length(); i++) {
            char ch = sen.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (!word.isEmpty()) {
                    words.add(word);
                    word = "";
                }
            }
        }
        if (!word.isEmpty()) {
            words.add(word);
        }
        System.out.println(words);
    }
}