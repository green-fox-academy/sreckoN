package classes.animal;

public class AnimalsTest {

    public static void main(String[] args) {

        Animal rabbit = new Animal(20, 20);

        System.out.println("Before: " + rabbit.hunger);
        rabbit.eat();
        System.out.println("After: " + rabbit.hunger);
        rabbit.play();
        System.out.println("Hunger: " + rabbit.hunger + " Thirst: " + rabbit.thirst);
    }
}
