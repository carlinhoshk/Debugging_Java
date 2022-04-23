package br.com.dio.debbuging;

/*
    03:50
    23/04/2022
    como é a execução do codigo java primeiro ele desce lendo as informação depois sobe executando o codigo
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Inicio do programa no método main.");
        a();
        System.out.println("Finalizo do programa no método mian.");
    }

    static void a(){
        System.out.println("Entrou no método a.");
        b();
        System.out.println("Finalizou o método a.");
    }

    static void b(){
        System.out.println("Entrou no método b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o método b.");
    }
    static void c(){
        System.out.println("Entrou no método c.");
        //Thread.dumpStack();
        System.out.println("Finalizou o método c.");
    }
}
