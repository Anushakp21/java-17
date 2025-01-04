package sealed_classes;

sealed class Animal permits Dog, OtherAnimal {
}

final class Dog extends Animal {
    @Override
    public String toString() {
        return "I am a Dog.";
    }
}

non-sealed class OtherAnimal extends Animal {
    @Override
    public String toString() {
        return "I am some other type of animal.";
    }
}

class Lion extends OtherAnimal {
    @Override
    public String toString() {
        return "I am a Lion.";
    }
}
public class SealedAndNonsealed {
	 public static void main(String[] args) {
	        Animal dog = new Dog();
	        Animal lion = new Lion();

	        System.out.println(dog);
	        System.out.println(lion);
	    }

}
