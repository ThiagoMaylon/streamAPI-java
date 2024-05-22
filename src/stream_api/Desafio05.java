package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

// Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
public class Desafio05 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        //double media = (double) numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum) / numeros.stream().filter(n -> n > 5).count();
        OptionalDouble media =  numeros.stream().mapToInt(n -> n).filter(n -> n > 5).average();
        System.out.println(media.getAsDouble());
    }
}
