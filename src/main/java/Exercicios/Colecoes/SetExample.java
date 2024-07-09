package Exercicios.Colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        // Criando um conjunto de strings
        // Um Set é uma coleção que não permite elementos duplicados. A implementação mais comum é HashSet
        Set<String> uniqueNames = new HashSet<>();

        uniqueNames.add("João");
        uniqueNames.add("Jose");
        uniqueNames.add("Maria");
        uniqueNames.add("Jaquelyne");
        uniqueNames.add("João"); // Este não será adicionado porque é um duplicado

        // Iterando sobre o conjunto
        for (String name : uniqueNames) {
            System.out.println(name);
        }
    }
}
