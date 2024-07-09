package Exercicios.OOP.ExemploOOP;

public class Employee extends Person {

    double salary;

    // Construtor
    public Employee(
            String name,
            int age,
            double height,
            String skin_color,
            String sexo,
            double salary
    ) {
        super(name, age, height, skin_color, sexo);
        this.salary = salary;
    }

    // Método adicional
    public void displayEmployeeInfo() {
        display(); // Chama o método da classe Person
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
