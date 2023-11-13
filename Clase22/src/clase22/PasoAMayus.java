package Clase22;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PasoAMayus {
    public static List<String> transLista(List<String> lista, Function<String, String> transformador) {
        
        return lista.stream()
                .map(transformador)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
       
       
        List<String> listaOriginal = new ArrayList<>();
        listaOriginal.add("hola");
        listaOriginal.add("mundo");
        listaOriginal.add("java");
        
  
        Function<String, String> transformadorMayusculas = String::toUpperCase;

    
        List<String> listaTransformada = transLista(listaOriginal, transformadorMayusculas);

       
        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Transformada: " + listaTransformada);
    }
}