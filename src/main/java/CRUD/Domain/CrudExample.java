package CRUD.Domain;

import CRUD.Domain.DAO.PersonDAO;
import CRUD.Domain.entity.Person;

import java.util.List;
import java.util.Scanner;

public class CrudExample {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Adicionar pessoa");
            System.out.println("2. Listar todas as pessoas");
            System.out.println("3. Atualizar pessoa");
            System.out.println("4. Deletar pessoa");
            System.out.println("5. Sair");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (choice) {
                case 1:
                    System.out.println("Digite o nome:");
                    String name = scanner.nextLine();
                    System.out.println("Digite a idade:");
                    int age = scanner.nextInt();
                    System.out.println("Digite a altura:");
                    double height = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.println("Digite a cor da pele:");
                    String skinColor = scanner.nextLine();
                    System.out.println("Digite o gênero:");
                    String gender = scanner.nextLine();
                    Person newPerson = new Person(name, age, height, skinColor, gender);
                    personDAO.addPerson(newPerson);
                    break;
                case 2:
                    System.out.println("Lista de todas as pessoas:");
                    List<Person> people = personDAO.getAllPeople();
                    for (Person person : people) {
                        System.out.println(person);
                    }
                    break;
                case 3:
                    System.out.println("Digite o ID da pessoa a ser atualizada:");
                    int idToUpdate = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.println("Digite o novo nome:");
                    String newName = scanner.nextLine();
                    System.out.println("Digite a nova idade:");
                    int newAge = scanner.nextInt();
                    System.out.println("Digite a nova altura:");
                    double newHeight = scanner.nextDouble();
                    scanner.nextLine(); // Consumir nova linha
                    System.out.println("Digite a nova cor da pele:");
                    String newSkinColor = scanner.nextLine();
                    System.out.println("Digite o novo gênero:");
                    String newGender = scanner.nextLine();
                    Person updatedPerson = new Person(idToUpdate, newName, newAge, newHeight, newSkinColor, newGender);
                    if (personDAO.updatePerson(updatedPerson)) {
                        System.out.println("Pessoa atualizada com sucesso.");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 4:
                    System.out.println("Digite o ID da pessoa a ser deletada:");
                    int idToDelete = scanner.nextInt();
                    if (personDAO.deletePerson(idToDelete)) {
                        System.out.println("Pessoa deletada com sucesso.");
                    } else {
                        System.out.println("Pessoa não encontrada.");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static int readInt(Scanner scanner, String prompt) {
        int value;

        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value > 0) {
                    break;
                } else {
                    System.out.println("Por favor, insira um número positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Consumir entrada inválida
            }
        }
        return value;
    }

    private static double readDouble(Scanner scanner, String prompt) {
        double value;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine(); // Consumir nova linha
                if (value >= 0) {
                    break;
                } else {
                    System.out.println("Por favor, insira um número positivo.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Consumir entrada inválida
            }
        }
        return value;
    }
}
