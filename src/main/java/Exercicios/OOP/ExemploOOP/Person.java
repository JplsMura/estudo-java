package Exercicios.OOP.ExemploOOP;

public class Person implements Displayable{
    //Campos
    String name;
    int age;
    double height;
    String skin_color;
    String sexo;

    // Construtor
    public Person(
            String name,
            int age,
            double height,
            String skin_color,
            String sexo
    ) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.skin_color = skin_color;
        this.sexo = sexo;
    }

    // Metodos
    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Skin Color: " + skin_color);
        System.out.println("Sexo: " + sexo);
        System.out.println();
    }
}
