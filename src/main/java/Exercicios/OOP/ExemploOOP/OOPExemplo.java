package Exercicios.OOP.ExemploOOP;

public class OOPExemplo {
    public static void main(String[] args){
        // Criando objeto Pessoa instância da class Person
        Person person1 = new Person(
                "João",
                30,
                1.68,
                "Black",
                "Masculino"
        );

        Person person2 = new Person(
                "Jaquelyne",
                29,
                1.60,
                "White",
                "Femenino"
        );

        // Criando objetos da classe Employee
        Employee employee1 = new Employee(
                "Carlos",
                35,
                1.75,
                "Brown",
                "Masculino",
                5000.00
        );

        Employee employee2 = new Employee(
                "Maria",
                28,
                1.65,
                "White",
                "Feminino",
                4500.00
        );

        // Usando o metodo de display desses dados
        person1.display();
        person2.display();
        employee1.displayEmployeeInfo();
        employee2.displayEmployeeInfo();
    }
}
