package by.overone.lesson27.task10;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Tester> testerStream = Stream.of(new Tester(9876543210L, "Buba"),
                new Tester(1L, "bbnova"),
                new Tester(2L, "Kenny"),
                new Tester(32323121L, "Deb"),
                new Tester(4L, "borya"),
                new Tester(5L, "bboolean777"));
        testerStream.filter(p -> p.getName().substring(0, 2).contains("bb"))
                .filter(p -> p.getId() > 3)
                .forEach(p -> System.out.println(p.getId() + " " + p.getName()));
    }
}
