package functional_interface.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
* Predicate<T>: Representa uma função que aceita um argumento do tipo T e retorna um valor booleano (verdadeiro ou falso).
* É comumente usada para filtrar os elementos do Stream com base em alguma condição.
*/
public class PredicateExample {
    public static void main(String[] args){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

//        Predicate<Integer> isPar = numero -> numero % 2 == 0;
//
//        List<Integer> numerosPares = numeros.stream()
//                .filter(isPar)
//                .toList();

        List<Integer> numerosPares = numeros.stream()
                        .filter(numero -> numero % 2 == 0).toList();
        numerosPares.forEach(System.out::println);

    }
}
