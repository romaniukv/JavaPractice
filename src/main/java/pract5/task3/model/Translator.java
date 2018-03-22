package pract5.task3.model;

import java.util.HashMap;
import java.util.Map;

public class Translator {

    private static Map<String, String> dictionary= new HashMap<>();

    public void addWord(String englishWord, String russianWord) {
        dictionary.put(englishWord, russianWord);
    }

    public String translatePhrase(String englishPhrase) {
        String[] englishWords = englishPhrase.split("[\\W|\\s]+");
        StringBuffer russianPhrase = new StringBuffer();
        String str;
        for (String englishWord: englishWords) {
            if ((str = dictionary.get(englishWord)) != null) {
                russianPhrase.append(str);
                russianPhrase.append(" ");
            }
            else
                russianPhrase.append("[unknown word] ");
        }
        return String.valueOf(russianPhrase);
    }
}
