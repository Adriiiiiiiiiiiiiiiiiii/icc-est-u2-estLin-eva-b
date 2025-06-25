package main;

import java.util.LinkedList;
import java.util.Queue;

public class App {
    public static void main(String[] args) throws Exception {
        LogicaClasificacion logica = new LogicaClasificacion();
        Queue<String> cola = new LinkedList<>();
        cola.offer("Ana");
        cola.offer("Luis");
        cola.offer("Martha");
        System.out.println("Cola antes de invertir" + cola);
        logica.invertirColaNombres(cola);
        System.out.println("Cola despues de invertir " + cola);
        Queue<Integer> cola1= new LinkedList<>();
        Queue<Integer> cola2= new LinkedList<>();
        cola1.add(1);
        cola1.add(3);
        cola1.add(5);
        cola2.add(2);
        cola2.add(4);
        cola1.add(6);
        cola1.add(8);
        System.out.println("Cola 1" + cola1);
        System.out.println("Cola 2" + cola2);
        logica.intercalarColas(cola1, cola2);
        Queue<Integer> resultado=logica.intercalarColas(cola1, cola2);
        System.out.println(resultado);
    }
}
