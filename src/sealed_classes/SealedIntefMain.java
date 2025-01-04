package sealed_classes;

sealed interface Vehicle permits Car, Bike, Truck {
    void displayType();
}

final class Car implements Vehicle {
    @Override
    public void displayType() {
        System.out.println("I am a Car.");
    }
}

final class Bike implements Vehicle {
    @Override
    public void displayType() {
        System.out.println("I am a Bike.");
    }
}

final class Truck implements Vehicle {
    @Override
    public void displayType() {
        System.out.println("I am a Truck.");
    }
}

public class SealedIntefMain {
	 public static void main(String[] args) {
	        Vehicle car = new Car();
	        Vehicle bike = new Bike();
	        Vehicle truck = new Truck();

	        car.displayType();
	        bike.displayType();
	        truck.displayType();
	    }
}
