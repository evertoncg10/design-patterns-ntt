package com.nttdata.creational.builder.before.models;

public class Cliente {

    private String cpf;
    private String NomeCompleto;
    private String NomeSocial;
    private String DataNascimento;
    private String email;

    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public Cliente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        NomeCompleto = nomeCompleto;
    }

    public Cliente(String cpf, String nomeCompleto, String nomeSocial) {
        this.cpf = cpf;
        NomeCompleto = nomeCompleto;
        NomeSocial = nomeSocial;
    }

    public Cliente(String cpf, String nomeCompleto, String nomeSocial, String dataNascimento) {
        this.cpf = cpf;
        NomeCompleto = nomeCompleto;
        NomeSocial = nomeSocial;
        DataNascimento = dataNascimento;
    }

    public Cliente(String cpf, String nomeCompleto, String nomeSocial, String dataNascimento, String email) {
        this.cpf = cpf;
        NomeCompleto = nomeCompleto;
        NomeSocial = nomeSocial;
        DataNascimento = dataNascimento;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", NomeCompleto='" + NomeCompleto + '\'' +
                ", NomeSocial='" + NomeSocial + '\'' +
                ", DataNascimento='" + DataNascimento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
