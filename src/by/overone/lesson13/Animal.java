package by.overone.lesson13;

import java.math.BigDecimal;
import java.util.Objects;

import static java.lang.Math.pow;

public class Animal {
    private Integer id;
    private String name;
    private Integer countOfPaws;
    private Boolean angry;
    private Double weight;
    private Double height;

    public Animal(Integer id, String name, Integer countOfPaws, Boolean angry) {
        this.id = id;
        this.name = name;
        this.countOfPaws = countOfPaws;
        this.angry = angry;
    }

    public Animal(Double weight, Double height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public boolean equals(Object obj) {
        return Objects.equals(this.id, ((Animal) obj).id) && Objects.equals(this.name, ((Animal) obj).name) && Objects.equals(this.countOfPaws, ((Animal) obj).countOfPaws) && this.angry == ((Animal)obj).angry;
    }

    public BigDecimal account() {
        return BigDecimal.valueOf(weight / pow(height,2));
    }

    public BigDecimal account(BigDecimal length, BigDecimal weight) {
        return length.multiply(weight);
    }

    public int hashCode() {
        return Objects.hash(id, name, countOfPaws, angry);
    }

    public String toString() {
       return "Id: " + this.id + "\nName: " + this.name + "\nCount of paws: " + this.countOfPaws + "\nStatus: " + this.angry;
    }
}
