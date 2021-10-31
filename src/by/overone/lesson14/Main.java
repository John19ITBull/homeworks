package by.overone.lesson14;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cat cat = new Cat("Kumkvat");
        Person person = new Person(3542532523L, "Benedikt", "Ben456@gmail.com", cat);
        Person personClone = (Person) person.clone();

        System.out.println(person);
        System.out.println(personClone);
        System.out.println("-------------------------------------------");

        person.setId(2354365461L);
        System.out.println(person);
        System.out.println(personClone);
        System.out.println("-------------------------------------------");

        person.getCat().setName("Persik");
        System.out.println(person);
        System.out.println(personClone);
        System.out.println("-------------------------------------------");

    }
}
