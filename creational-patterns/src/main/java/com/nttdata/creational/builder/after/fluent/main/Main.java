package com.nttdata.creational.builder.after.fluent.main;

import com.nttdata.creational.builder.after.fluent.cliente.Cliente;
import com.nttdata.creational.builder.after.fluent.cliente.Cliente2;
import com.nttdata.creational.builder.after.fluent.cliente.ClienteBuilder;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = ClienteBuilder.builder()
                .cpf("981.363.980-62")
                .nomeCompleto("Everton Ribeiro")
                .nomeSocial("Everton")
                .dataNascimento("01/01/1998")
                .email("everton_ribeiro@hotmail.com")
                .build();

        System.out.println(cliente);

        Cliente2 cliente2 = new Cliente2.Builder()
                .cpf("454.590.120-40")
                .nomeCompleto("José Silva")
                .nomeSocial("José")
                .dataNascimento("12/11/1986")
                .email("jose_silva@gmail.com")
                .build();

        System.out.println(cliente2);

    }
}
