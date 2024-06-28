package one.digitalinnovation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();

        //NÃO SEGUE UMA ORDEM GERA ALEATORIAMENTE 
        hashSetCarros.add(new Carro("FORD"));
        hashSetCarros.add(new Carro("BYD"));
        hashSetCarros.add(new Carro("FERRARI"));
        hashSetCarros.add(new Carro("ZENITY"));
        hashSetCarros.add(new Carro("ARGO"));

        System.out.println(hashSetCarros);


        //OLHA SÓ SE A ARVORE NÃO VOLTOU
        Set<Carro> treeSetCarros = new TreeSet<>();
        treeSetCarros.add(new Carro("FORD"));
        treeSetCarros.add(new Carro("BYD"));
        treeSetCarros.add(new Carro("FERRARI"));
        treeSetCarros.add(new Carro("ZENITY"));
        treeSetCarros.add(new Carro("ARGONIX"));

        System.out.println(treeSetCarros);
        
    }
}
