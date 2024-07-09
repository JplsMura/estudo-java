package Exercicios.Excecoes;

public class ThrowExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("A idade deve ser 18 ou mais para se registrar");
        } else {
            System.out.println("Registrado com sucesso");
        }
    }
}
