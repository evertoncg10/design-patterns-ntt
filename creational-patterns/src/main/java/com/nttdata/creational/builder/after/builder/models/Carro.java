package com.nttdata.creational.builder.after.builder.models;

public class Carro {

    private final TipoCarroEnum tipoCarro;
    private final int numeroLugares;
    private final Motor motor;
    private final Transmissao transmissao;

    public Carro(TipoCarroEnum carType,
                    int seats,
                    Motor engine,
                    Transmissao transmission){
        this.tipoCarro = carType;
        this.numeroLugares = seats;
        this.motor = engine;
        this.transmissao = transmission;
    }

    public TipoCarroEnum getTipoCarro() {
        return tipoCarro;
    }

    public int getNumeroLugares() {
        return numeroLugares;
    }

    public Motor getMotor() {
        return motor;
    }

    public Transmissao getTransmissao() {
        return transmissao;
    }
}
