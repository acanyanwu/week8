package day2.prob3.a;

import java.util.Arrays;
import java.util.List;

public class FruitsTestUsingLambda
{
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana","Orange","Cherries","blums");
        fruits.stream().forEach(fruit->System.out.println(fruit));
    }
}
