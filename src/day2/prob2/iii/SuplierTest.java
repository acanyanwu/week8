package day2.prob2.iii;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Use supplier implementation to get a 10 random numbers using supplier inner  class
 * @author anthonyanyanwu
 *
 */
public class SuplierTest
{
    public Supplier<Double> getRandom() {
        return Math::random;
    }
    
    public static void main(String[] args) {
        System.out.println("starting test....");
        Stream.generate(new RandomGenerator())
        .limit(10)
        .forEach(System.out::println);
    }
    
    private static class RandomGenerator implements Supplier<Double> {

        @Override
        public Double get()
        {
            return Math.random();
        }
        
    }
}
