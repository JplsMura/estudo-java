package Exercicios.Colecoes;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        // Criando uma lista de string
        List<String> names = new ArrayList<>();
        names.add("João");
        names.add("Maria");
        names.add("José");
        names.add("Hanna");

        // iterando a lista de array de nomes
        for (String name : names){
            System.out.println(name);
        }
    }
}
