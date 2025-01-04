package random_generator;

import java.util.random.RandomGenerator;

public class RandomExample {
	 public static void main(String[] args) {
	        // Using the RandomGenerator factory method
	        RandomGenerator random = RandomGenerator.of("Xoshiro256PlusPlus");

	        System.out.println("10 Random Numbers:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(random.nextInt(1, 101)); // Random integers between 1 and 100
	        }

	        System.out.println("\n10 Random Doubles:");
	        for (int i = 0; i < 10; i++) {
	            System.out.println(random.nextDouble()); // Random doubles between 0.0 and 1.0
	        }
	    }
}
