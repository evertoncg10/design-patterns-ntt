package com.nttdata.creational.factorymethod.phone.halfSimple.model;

import java.math.BigDecimal;

public class Celular {

    protected long id;
    protected String nome;
    protected String sistemaOperacional;
    protected BigDecimal preco;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSistemaOperacional() {
        return sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        this.sistemaOperacional = sistemaOperacional;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", sistemaOperacional='" + sistemaOperacional + '\'' +
                ", preco=" + preco +
                '}';
    }
}
