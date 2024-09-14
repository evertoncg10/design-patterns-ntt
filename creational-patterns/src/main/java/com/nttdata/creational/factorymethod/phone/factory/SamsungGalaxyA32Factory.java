package com.nttdata.creational.factorymethod.phone.factory;

import com.nttdata.creational.factorymethod.phone.factory.model.Celular;
import com.nttdata.creational.factorymethod.phone.factory.model.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;

public class SamsungGalaxyA32Factory implements CelularFactory {
    @Override
    public Celular criarCelular() {
        Celular samsungGalaxyA32Factory = new SamsungGalaxyS24Ultra();
        samsungGalaxyA32Factory.setId(4L);
        samsungGalaxyA32Factory.setNome("Samsung Galaxy A32");
        samsungGalaxyA32Factory.setSistemaOperacional("Android 12");
        samsungGalaxyA32Factory.setPreco(new BigDecimal("1500.00"));
        return samsungGalaxyA32Factory;
    }
}
