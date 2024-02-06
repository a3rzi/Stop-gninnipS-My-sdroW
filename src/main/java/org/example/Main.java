package org.example;
public class Main {
    public static void main(String[] args) {
        //given
        String sentence = "Hey fellow warriors abcde abcd";

        //when
        String result = spinWords(sentence);
        System.out.println(result);

    }

    private static String spinWords(String sentence) {

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].length()>=5){
                words[i] = reverseWord(words[i]);
            }
        }
        return String.join(" ", words);
    }

    private static String reverseWord(String word) {
        StringBuilder str = new StringBuilder(word);
        str.reverse();
        return str.toString();
    }
}