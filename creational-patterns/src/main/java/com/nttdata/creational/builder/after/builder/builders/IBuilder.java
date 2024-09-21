package com.nttdata.creational.builder.after.builder.builders;

import com.nttdata.creational.builder.after.builder.models.Motor;
import com.nttdata.creational.builder.after.builder.models.TipoCarroEnum;
import com.nttdata.creational.builder.after.builder.models.Transmissao;

public interface IBuilder {

    void setTipoCarro(TipoCarroEnum tipoCarro);

    void setNumeroLugares(int numeroLugares);

    void setTransmissao(Transmissao transmissao);

    void setMotor(Motor motor);
}
