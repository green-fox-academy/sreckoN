package strings;

public class TakesLonger {

    public static void main(String[] args) {

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        StringBuilder sb = new StringBuilder(quote);

        sb.insert(21, "always takes longer than ");
        quote = sb.toString();

        System.out.println(quote);

    }

}
