package by.overone.lesson14;

import java.util.Objects;

public class Person implements Cloneable {

    private Long id;
    private String name;
    private String email;
    private Cat cat;

    public Person(Long id, String name, String email, Cat cat) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cat = cat;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(id, person.id) && Objects.equals(name, person.name) && Objects.equals(email, person.email) && Objects.equals(cat, person.cat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, cat);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", cat=" + cat +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object cat = this.getCat().clone();
        Object catClone = super.clone();
        ((Person) catClone).setCat((Cat) cat);
        return catClone;
//     second solution
//     return new Person (  this.id,  this.name,  this.email,  new Cat( this.cat.getName()));
//        Person person = (Person) super.clone();
//        person.cat = this.cat.clone();
//        return person;
    }
}
