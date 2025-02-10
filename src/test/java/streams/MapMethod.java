package test.java.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MapMethod {

  public static void main(String[] args) {
    List<String> list= Arrays.asList("vikas","rahul");
    List<String> list1 = list.stream().map(input -> input.toUpperCase()).toList();
//    System.out.println(list1);

    String [] str={"vikas","rahul"};
//    Arrays.stream(str).map(word->word.split("")).flatMap(Arrays::stream).forEach(System.out::println);
//    Arrays.stream(str).map(c->c.chars()).forEach(System.out::println);

    List<List<String>> list2 = Arrays.asList(Arrays.asList("Vikas"), Arrays.asList("gaikwad"));
//    list2.forEach(System.out::print);
//    list2.stream().map(List::stream).forEach(System.out::println);
    list2.stream().flatMap(Collection::stream).forEach(System.out::println);
  }
}
