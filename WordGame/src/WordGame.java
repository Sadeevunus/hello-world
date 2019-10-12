import java.util.HashMap;
import java.util.Random;

public class WordGame {

    public HashMap <String, String> wordsWithTranslation;

    public HashMap <String, Integer> scores;

    public String [] words;

    public boolean check (String word,String translationToCheck)
    {
        String rightTranslation = wordsWithTranslation.get(word);
        return rightTranslation.equals(translationToCheck);


    }

    public String nextWord() {
        Random random = new Random();
        int index = random.nextInt(words.length);
        return words[index];
    }
    public WordGame () {
        this.wordsWithTranslation = new HashMap<>();
        this.wordsWithTranslation.put("word", "слово");
        this.wordsWithTranslation.put("hello", "привет");
        this.wordsWithTranslation.put("butter", "масло");
        this.wordsWithTranslation.put("soap", "мыло");
        this.wordsWithTranslation.put("car", "машина");

        this.scores = new HashMap<String, Integer>();
        words = new String[wordsWithTranslation.size()];
        int i = 0;
        for (String current : this.wordsWithTranslation.keySet()) {
            this.scores.put(current, 0);
            words[i] = current;
            i++;
        }
    }
}
