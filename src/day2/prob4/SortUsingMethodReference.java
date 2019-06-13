package day2.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortUsingMethodReference
{
    public static void main(String[] args) {
        String[] names = {"Alexis", "Tim", "Kyleen", "KRISTY"};
        List<String> nameList = Arrays.asList(names);
        nameList = nameList.stream().sorted(String::compareToIgnoreCase).collect(Collectors.toList());
        System.out.println(nameList);
    }
}
