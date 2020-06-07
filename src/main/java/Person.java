public class Person {
    private String name;
    private Double height;
    private int age;
    public Person(String name, Double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public Double getHeight() {
        return height;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}