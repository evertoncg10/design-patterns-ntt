package com.nttdata.creational.builder.before.main;

import com.nttdata.creational.builder.before.models.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("62524113027");

        Cliente cliente2 = new Cliente("62524113027", "Everton");

        Cliente cliente3 = new Cliente("62524113027", "Everton Cezar", "Everton");

        Cliente cliente4 = new Cliente(null, "Everton Cezar");

        Cliente cliente5 = new Cliente(null, null, null,null, "everton@gmail.com");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);

    }
}
