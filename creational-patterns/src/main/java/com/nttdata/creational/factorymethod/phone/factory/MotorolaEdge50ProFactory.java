package com.nttdata.creational.factorymethod.phone.factory;

import com.nttdata.creational.factorymethod.phone.factory.model.Celular;
import com.nttdata.creational.factorymethod.phone.factory.model.MotorolaEdge50Pro;

import java.math.BigDecimal;

public class MotorolaEdge50ProFactory implements CelularFactory {
    @Override
    public Celular criarCelular() {
        Celular motorolaEdge50Pro = new MotorolaEdge50Pro();
        motorolaEdge50Pro.setId(2L);
        motorolaEdge50Pro.setNome("Motorola Edge 50 Pro");
        motorolaEdge50Pro.setSistemaOperacional("Android 14");
        motorolaEdge50Pro.setPreco(new BigDecimal("3149.10"));
       return motorolaEdge50Pro;
    }
}
