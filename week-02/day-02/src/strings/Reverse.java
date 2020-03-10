package strings;

public class Reverse {

    public static void main(String[] args) {

        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(toBeReversed));

    }

    public static String reverse(String s) {
        if (s.isEmpty()) return null;
        String reversed = "";
        for (int i = s.length() - 1; i > 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

}
