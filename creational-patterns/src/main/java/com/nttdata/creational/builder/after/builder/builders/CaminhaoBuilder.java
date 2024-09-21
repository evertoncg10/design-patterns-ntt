package com.nttdata.creational.builder.after.builder.builders;

import com.nttdata.creational.builder.after.builder.models.Caminhao;
import com.nttdata.creational.builder.after.builder.models.Motor;
import com.nttdata.creational.builder.after.builder.models.TipoCarroEnum;
import com.nttdata.creational.builder.after.builder.models.Transmissao;

public class CaminhaoBuilder implements IBuilder {
    private TipoCarroEnum tipoCarro;
    private int numeroLugares;
    private Motor motor;
    private Transmissao transmissao;

    @Override
    public void setTipoCarro(TipoCarroEnum tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    @Override
    public void setNumeroLugares(int numeroLugares) {
        this.numeroLugares = numeroLugares;
    }

    @Override
    public void setTransmissao(Transmissao transmissao) {
        this.transmissao = transmissao;
    }

    @Override
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Caminhao build() {
        return new Caminhao(tipoCarro, numeroLugares, motor, transmissao);
    }
}
