package classes.animal;

public class AnimalsTest {

    public static void main(String[] args) {

        Animal rabbit = new Animal(20, 20);

        Animal foxy = new Animal();

        System.out.println("Before: " + rabbit.hunger);
        rabbit.eat();
        System.out.println("After: " + rabbit.hunger);
        rabbit.play();
        System.out.println("Hunger: " + rabbit.hunger + " Thirst: " + rabbit.thirst);

        System.out.println("**FOXY**");
        System.out.println(foxy.hunger + " " + foxy.thirst);

    }
}
