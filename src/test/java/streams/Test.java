package test.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import test.java.entity.Product;

public class Test {

  public static void main(String[] args) {
List<Product> products= Arrays.asList(
    new Product("samsung",21),
    new Product("Apple",23),
    new Product("Moto",22),
    new Product("huwaue",20000),
    new Product("nokia",250000)
);
//option 1
    String collect = products.stream()
        .collect(Collectors.collectingAndThen(
            Collectors
                .minBy(Comparator.comparing(Product::getPrice)),
                (Optional<Product> prod) -> prod.isPresent() ? prod.get().getName() : "list is empty")
        );
    System.out.println(collect);
//option 2
    String prods = products.stream()
        //.collect(Collectors.maxBy(Comparator.comparing(Product::getPrice)))
        .max(Comparator.comparing(Product::getPrice))
        .map(Product::getName).orElse("not found");
    System.out.println(prods);


  }

}
