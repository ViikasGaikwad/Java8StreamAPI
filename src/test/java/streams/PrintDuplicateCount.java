package test.java.streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicateCount {

  public static void main(String[] args) {
    var data=Arrays.asList("vikas","akash","amol","sagar","vikas","pratik","vikas","naval","amit","nikhil","pratik");
    var d=data.stream().collect(Collectors.groupingBy(
        Function.identity(),
        LinkedHashMap::new,
        Collectors.counting()
    )).entrySet()
        .stream()
        .filter(x->x.getValue()>1)
        //.map(Entry::getKey)
        .toList();
    System.out.println(d);

  }

}
