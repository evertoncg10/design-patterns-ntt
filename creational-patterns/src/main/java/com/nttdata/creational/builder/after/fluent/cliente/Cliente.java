package com.nttdata.creational.builder.after.fluent.cliente;

public class Cliente {

    private String cpf;
    private String nomeCompleto;
    private String nomeSocial;
    private String dataNascimento;
    private String email;

    protected Cliente() {}

    public String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    protected void setNomeCompleto(String nomeCompleto) {
        nomeCompleto = nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    protected void setNomeSocial(String nomeSocial) {
        nomeSocial = nomeSocial;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    protected void setDataNascimento(String dataNascimento) {
        dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf='" + cpf + '\'' +
                ", NomeCompleto='" + nomeCompleto + '\'' +
                ", NomeSocial='" + nomeSocial + '\'' +
                ", DataNascimento='" + dataNascimento + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
