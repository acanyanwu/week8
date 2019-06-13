package day2.prob2.i;

import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Use supplier implementation to get a 10 random numbers. 
 * @author anthonyanyanwu
 *
 */
public class SuplierTest
{
    public Supplier<Double> getRandom() {
        return Math::random;
    }
//    
//    
//    /**
//     * This is test where function
//     */
//    public static void test1() {
//      SuplierTest test = new SuplierTest();
//      System.out.println("Starting test 1");
//      Stream.generate(test.getRandom())
//      .limit(10)
//      .forEach(System.out::println);
//    }
    
    public static void test() {
        System.out.println("starting test2....");
        Stream.generate(Math::random)
        .limit(10)
        .forEach(System.out::println);
    }
    
    public static void main(String[] args) {
//        test1();
//        System.out.println();
        test();
    }
}
