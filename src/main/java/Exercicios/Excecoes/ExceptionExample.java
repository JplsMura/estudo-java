package Exercicios.Excecoes;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]); // Isto causará uma ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Tentou acessar um índice fora dos limites do array.");
        } finally {
            System.out.println("Bloco finally executado.");
        }
    }
}
