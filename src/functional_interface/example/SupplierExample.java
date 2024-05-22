package functional_interface.example;


import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

/*
*Supplier<T>: Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
*É comumente usada para criar ou fornecer novos objetos de um determinado tipo.
*/
public class SupplierExample {
    public static void main(String[] args){
//        Supplier<String> saudacao = () -> "Olá, seja bem-vindo(a)!";
//        List<String> listaSaudacao = Stream.generate(saudacao)
//                .limit(5).toList();

        List<String> listaSaudacao = Stream.generate(() ->  "Olá, seja bem-vindo(a)!")
                .limit(3).toList();
        listaSaudacao.forEach(System.out::println);
    }
}
