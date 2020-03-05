package excercises;

public class ConditionalVariableMutation {

    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        // if a is even increment out by one
        if (a % 2 == 0) out++;

        System.out.println(out);




        int b = 13;
        String out2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if (b >= 10 && b <= 20) out2 += "Sweet!";
        if (b < 10) out2 += "Less!";
        if (b > 20) out2 += "More!";
        System.out.println(out2);
    }

}
