package excercises;

public class SecondsInADay {

    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables
        int hoursLeft = 24 - currentHours;
        int minutesLeft = 60 - currentMinutes;
        int secondsLeft = 60 - currentSeconds;

        int remainingSeconds = hoursLeft * 60 * 60 + minutesLeft * 60 + secondsLeft;
        System.out.println(remainingSeconds);
    }

}
