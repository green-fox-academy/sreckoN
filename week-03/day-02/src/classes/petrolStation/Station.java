package classes.petrolStation;

public class Station {

    int gasAmount;

    public void refill(Car car) {//decreases the gasAmount by the capacity of the car and increases the cars gasAmount
        this.gasAmount -= car.capacity;
        car.gasAmount = car.capacity;
    }
}
