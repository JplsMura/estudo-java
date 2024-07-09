package CRUD.Domain.entity;

public class Person {

    private int id;
    private String name;
    private int age;
    private double height;
    private String skinColor;
    private String gender;

    public Person(
            int id,
            String name,
            int age,
            double height,
            String skinColor,
            String gender
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.skinColor = skinColor;
        this.gender = gender;
    }

    // Construtor sem ID para inserções
    public Person(String name, int age, double height, String skinColor, String gender) {
        this(-1, name, age, height, skinColor, gender);
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", skinColor='" + skinColor + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
