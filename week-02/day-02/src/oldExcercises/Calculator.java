package oldExcercises;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        calculate();

    }

    public static void calculate() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please type in the expression: ");
        String expression = in.nextLine();

        String[] pieces = expression.split(" ");
        if (pieces.length != 3) return;

        String operand = pieces[0];
        int a = Integer.parseInt(pieces[1]);
        int b = Integer.parseInt(pieces[2]);

        if (operand.equalsIgnoreCase("+")) System.out.println(a + b);
        else if (operand.equalsIgnoreCase("-")) System.out.println(a - b);
        else if (operand.equalsIgnoreCase("*")) System.out.println(a * b);
        else if (operand.equalsIgnoreCase("/")) System.out.println((double) a / b);
        else if (operand.equalsIgnoreCase("%")) System.out.println(a % b);
        else System.out.println("Unsupported operation.");
    }

}
