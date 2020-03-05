package excercises;

public class DrawChessTable {

    public static void main(String[] args) {
        String line1 = " % % % % ";
        String line2 = "  % % % %";

        for (int i = 1; i <= 8; i++) {
            if (i % 2 != 0) System.out.println(line1);
            else System.out.println(line2);
        }
    }

}
