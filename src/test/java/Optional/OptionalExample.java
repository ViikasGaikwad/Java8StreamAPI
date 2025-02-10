package test.java.Optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class OptionalExample {

  public static void main(String[] args) {
    optionalImpl();
  }
  public static void optionalImpl(){
    String []str=new String[10];
    str[5]="vikas";
//    Optional<String> empty = Optional.empty();
//    System.out.println(empty);
    Optional<String> value=Optional.of(str[5]);
//    System.out.println(value.get());
    Optional<String> ofnullable = Optional.ofNullable(str[6]);
//    System.out.println(ofnullable.orElse("not present"));
//    ofnullable.ifPresent(System.out::println);

    Optional<String> nonEmptyString = Optional.of("vikas gaikwad");
    Optional<String> emptyString = Optional.empty();

    //convert to Uppercase
    Optional<String> upperCase = nonEmptyString.map(String::toUpperCase);
    System.out.println(upperCase.get());
    Optional<String> toEmptyString = emptyString.map(String::toUpperCase);
    System.out.println(toEmptyString);

    Optional<Optional<String>> innerOptional = Optional.of(Optional.of("Vikas Gaikwad"));
    System.out.println(innerOptional);//Optional[Optional[Vikas Gaikwad]]
    Optional<Optional<String>> innerUpperCase = innerOptional.map(input -> input.map(String::toUpperCase));
    System.out.println(innerUpperCase);//ptional[Optional[VIKAS GAIKWAD]]
    Optional<String> flatMap = innerOptional.flatMap(input -> input.map(String::toUpperCase));
    System.out.println(flatMap);//Optional[VIKAS GAIKWAD]
    System.out.println(flatMap.get());//VIKAS GAIKWAD
    List<Integer> arr = Arrays.asList(1, 3, 5);



  }

}
