package by.overone.lesson27.task11;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Tester> testerStream = Stream.of(new Tester(9876543210L, "Buba"),
                new Tester(3L, "bbnova"),
                new Tester(null, "Kenny"),
                new Tester(3L, "Deb"),
                new Tester(null, "borya"),
                new Tester(5L, "bboolean777"));
        testerStream.filter(p -> !(p.getId() == null))
                .forEach(p -> System.out.println(p.getId() + " " + p.getName()));
    }
}
