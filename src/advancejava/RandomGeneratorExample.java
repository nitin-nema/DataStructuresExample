package advancejava;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomGeneratorExample {
    public static void main(String[] args) {
        RandomGenerator randomGenerator = RandomGeneratorFactory.of("L32X64MixRandom").create();
        System.out.println("Random number: " + randomGenerator.nextInt());
    }
}
