package mx.uach.fing.zoo.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Modelo de un Animal en el sistema, es la clase padre de todos los modelos
 * en el zoo.
 *
 * @author Luis Ramirez
 * @since 1.0
 * @version 1.0
 */
public class Animal {

    int numeroPatas;
    Integer numeroOjos;

    public Animal(){


       // a.numeroOjos.
       // a.numeroPatas;

    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        Integer res = animal.sumar(4,7, 9,8,7,5,11,22,78);
        System.out.println(String.format("El resultado es %s", res));
    }

    public Integer sumar(Integer x, Integer... n){
        //List<Integer> numeros = new ArrayList(); //-> Lista en blanco
        //numeros.addAll(Arrays.asList(n));

        List<Integer> numeros = Arrays.asList(n);
        /*for (int i = 0; i < numeros.size(); i++) {
            x = x + numeros.get(i);
        }*/

        /*for(Integer numero:numeros){
            x = x + numero;
        }*/

        numeros.stream().forEach(numero -> {
            System.out.println(numero);
        });


        return x;
    }


}
