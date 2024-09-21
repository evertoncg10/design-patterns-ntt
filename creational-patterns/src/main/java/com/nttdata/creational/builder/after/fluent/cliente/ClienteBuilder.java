package com.nttdata.creational.builder.after.fluent.cliente;

public class ClienteBuilder {
    private Cliente cliente;

    private String cpf;
    private String nomeCompleto;
    private String nomeSocial;
    private String dataNascimento;
    private String email;

    private ClienteBuilder(){
        this.cliente = new Cliente();
    }

    public static ClienteBuilder builder() {
        return new ClienteBuilder();
    }

    public ClienteBuilder cpf(String cpf){
        this.cliente.setCpf(cpf);
        return this;
    }

    public ClienteBuilder nomeCompleto(String nomeCompleto){
        this.cliente.setNomeCompleto(nomeCompleto);
        return this;
    }

    public ClienteBuilder nomeSocial(String nomeSocial){
        this.cliente.setNomeSocial(nomeSocial);
        return this;
    }

    public ClienteBuilder dataNascimento(String dataNascimento){
        this.cliente.setDataNascimento(dataNascimento);
        return this;
    }

    public ClienteBuilder email(String email){
        this.cliente.setEmail(email);
        return this;
    }

    public Cliente build(){
        return this.cliente;
    }
}
