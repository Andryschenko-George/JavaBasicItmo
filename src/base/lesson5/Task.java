package base.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
    public String longestword (String string){
        String[] words = string.split(" ");
        String longestword = words[0];
        for (String word : words) {
            if (word.length()>longestword.length()){
                longestword = word;
            }
        }
        return longestword;
    }
    public Boolean palindrome (String string){
        for (int i = 0; i < string.length(); i++) {
            Character c1 = string.charAt(i);
            Character c2 = string.charAt(string.length()-1-i);
            c1 = Character.toUpperCase(c1);
            c2 = Character.toUpperCase(c2);
            if (!c1.equals(c2)){
                return false;
            }
        }
        return true;
    }
    public String bword(String string, String regex, String replacement){
        return string.replaceAll(regex,replacement);
    }
    public int isSubstring(String mainString, String substring){
        int counter = 0;
        int index = 0;
        while ((index = mainString.indexOf(substring, index)) != -1) {
            counter++;
            index += substring.length();
            System.out.println("index"+index);
            System.out.println("count" + counter);
        }
        return counter;
    }

    public String invertWords () throws IOException {
        System.out.println("Введите строку:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sentence = reader.readLine();

        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }


        String[] words = sentence.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            reversedString.append(word.reverse());
            if (i < words.length - 1) {
                reversedString.append(" ");
            }
        }
        return reversedString.toString();
    }
}

