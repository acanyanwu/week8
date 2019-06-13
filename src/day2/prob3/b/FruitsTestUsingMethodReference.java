package day2.prob3.b;

import java.util.Arrays;
import java.util.List;

public class FruitsTestUsingMethodReference
{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        fruits.stream().forEach(System.out::println);
    }
}
