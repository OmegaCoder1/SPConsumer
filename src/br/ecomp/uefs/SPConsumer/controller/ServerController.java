package br.ecomp.uefs.SPConsumer.controller;

import java.net.DatagramSocket;
import java.util.Scanner;

import br.ecomp.uefs.SPConsumer.model.Cliente;
import br.ecomp.uefs.SPConsumer.model.Nuvem;

public class ServerController {
    DatagramSocket serverdgram = new DatagramSocket(7777);

    public void inicializaServer(int n) {
        Nuvem cloud = new Nuvem(n);
        int a = 0;
        String nome;
        while(a < n){
            Scanner entrada = new Scanner(System.in);
            nome = entrada.toString();
            
            Cliente o = new Cliente(a, nome);

            

        }

    }
    
}
