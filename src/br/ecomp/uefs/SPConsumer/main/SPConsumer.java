package br.ecomp.uefs.SPConsumer.main;

import java.util.Scanner;

public class SPConsumer{

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Digite 1 para Cliente e 2 para Servidor:");
            int numero = entrada.nextInt();
            
            switch(numero){
                case 1:
                    System.out.println("Opcao 1 escolhida");
                break;

                case 2:
                    System.out.println("Opcao 2 escolhida");
                break;


                default: 
                    System.out.println("Numero invalido, por favor digite um numero entre 1 e 2:");

            }
        }
    }

}
