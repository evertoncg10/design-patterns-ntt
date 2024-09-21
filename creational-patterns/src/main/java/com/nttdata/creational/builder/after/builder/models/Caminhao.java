package com.nttdata.creational.builder.after.builder.models;

public class Caminhao {
    private final TipoCarroEnum tipoCarro;
    private final int numeroLugares;
    private final Motor motor;
    private final Transmissao transmissao;

    public Caminhao(TipoCarroEnum carType,
                    int seats,
                    Motor engine,
                    Transmissao transmission){
        this.tipoCarro = carType;
        this.numeroLugares = seats;
        this.motor = engine;
        this.transmissao = transmission;
    }

    public String result(){
        String caminhao = "Caminhão com motor: " + motor.getPower() + " e ";
        caminhao += "Transmissão: " + transmissao;

        return caminhao;
    }
}
