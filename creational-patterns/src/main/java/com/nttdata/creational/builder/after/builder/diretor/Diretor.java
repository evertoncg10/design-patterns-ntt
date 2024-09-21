package com.nttdata.creational.builder.after.builder.diretor;

import com.nttdata.creational.builder.after.builder.builders.IBuilder;
import com.nttdata.creational.builder.after.builder.models.Motor;
import com.nttdata.creational.builder.after.builder.models.TipoCarroEnum;
import com.nttdata.creational.builder.after.builder.models.Transmissao;

public class Diretor {

    public void constructSedanCar(IBuilder builder){
        builder.setTipoCarro(TipoCarroEnum.SEDAN);
        builder.setNumeroLugares(5);
        builder.setTransmissao(Transmissao.CVT);
        builder.setMotor(new Motor(1600));
    }

    public void constructTruck(IBuilder builder){
        builder.setTipoCarro(TipoCarroEnum.CAMINHAO);
        builder.setNumeroLugares(3);
        builder.setTransmissao(Transmissao.AUTOMATICO);
        builder.setMotor(new Motor(13000));
    }

    public static Diretor diretor() {
        return new Diretor();
    }
}
