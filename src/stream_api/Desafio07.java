package stream_api;

import java.util.*;

// Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public class Desafio07 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        System.out.println(segundoMaior.get());
    }
}
