package com.nttdata.creational.abstractfactory.phone.factory;

import com.nttdata.creational.abstractfactory.phone.factory.abstractfactory.RegrasPaisesAbstractFactory;
import com.nttdata.creational.abstractfactory.phone.model.celular.Celular;
import com.nttdata.creational.abstractfactory.phone.model.celular.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;

public class SamsungGalaxyA32Factory implements CelularFactory {
    RegrasPaisesAbstractFactory rules;

    public SamsungGalaxyA32Factory(RegrasPaisesAbstractFactory rules) {
        this.rules = rules;
    }

    @Override
    public Celular criarCelular() {
        Celular samsungGalaxyA32Factory = new SamsungGalaxyS24Ultra(rules);
        samsungGalaxyA32Factory.setId(4L);
        samsungGalaxyA32Factory.setNome("Samsung Galaxy A32");
        samsungGalaxyA32Factory.setSistemaOperacional("Android 12");
        samsungGalaxyA32Factory.setPreco(new BigDecimal("1500.00"));

        samsungGalaxyA32Factory.criarCertificado();
        samsungGalaxyA32Factory.empacotar();

        return samsungGalaxyA32Factory;
    }
}
