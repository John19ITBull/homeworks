package by.overone.lesson27.task10;

public class Tester {
    private Long id;
    private String name;

    public Tester(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Tester(Long id) {
        this.id = id;
    }

    public Tester(String name) {
        this.name = name;
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
}
