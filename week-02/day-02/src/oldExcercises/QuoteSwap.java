package oldExcercises;

import java.util.ArrayList;
import java.util.Arrays;

public class QuoteSwap {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

        // Accidentally I messed up this quote from Richard Feynman.
        // Two words are out of place
        // Your task is to fix it by swapping the right words with code
        // Create a method called quoteSwap().

        // Also, print the sentence to the output with spaces in between.
        System.out.println(quoteSwap(list));
        // Expected output: "What I cannot create I do not understand."
    }

    public static String quoteSwap(ArrayList<String> listOfWords) {
        String doWord = listOfWords.remove(listOfWords.indexOf("do"));
        String cannot = listOfWords.remove(listOfWords.indexOf("cannot"));

        listOfWords.add(2, cannot);
        listOfWords.add(5, doWord);

        String sentence = "";
        for (int i = 0; i < listOfWords.size(); i++) {
            if (i == listOfWords.size() - 1) sentence += listOfWords.get(i);
            else sentence += listOfWords.get(i) + " ";
        }
        return sentence;
    }

}
