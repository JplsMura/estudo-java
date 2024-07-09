package Exercicios.Colecoes;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        // criando mapa de idades
        Map<String, Integer> ages = new HashMap<>();

        ages.put("João", 29);
        ages.put("Jose", 75);
        ages.put("Cecilia", 72);
        ages.put("Jaque", 29);
        ages.put("João", 35); // ele não deixa add um dado já duplicado

        // iterando o map
        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
