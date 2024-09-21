package com.nttdata.creational.builder.after.fluent.cliente;

public class Cliente2 {
    private final String cpf;
    private final String nomeCompleto;
    private final String nomeSocial;
    private final String dataNascimento;
    private final String email;

    public Cliente2(Builder builder) {
        this.cpf = builder.cpf;
        this.nomeCompleto = builder.nomeCompleto;
        this.nomeSocial = builder.nomeSocial;
        this.dataNascimento = builder.dataNascimento;
        this.email = builder.email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getEmail() {
        return email;
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

    public static class Builder {
        private String cpf;
        private String nomeCompleto;
        private String nomeSocial;
        private String dataNascimento;
        private String email;

        public Builder cpf(String cpf){
            this.cpf = cpf;
            return this;
        }

        public Builder nomeCompleto(String nomeCompleto){
            this.nomeCompleto = nomeCompleto;
            return this;
        }

        public Builder nomeSocial(String nomeSocial){
            this.nomeSocial = nomeSocial;
            return this;
        }

        public Builder dataNascimento(String dataNascimento){
            this.dataNascimento = dataNascimento;
            return this;
        }

        public Builder email(String email){
            this.email = email;
            return this;
        }

        public Cliente2 build(){
            return new Cliente2(this);
        }
    }
}
