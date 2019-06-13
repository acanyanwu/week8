package day2.prob2.ii;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Use supplier implementation to get a 10 random numbers using lambda expression
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
        Stream.generate(()->Math.random())
        .limit(10)
        .forEach(System.out::println);
    }
}
