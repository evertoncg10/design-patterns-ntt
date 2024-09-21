package com.nttdata.creational.abstractfactory.phone.factory;

import com.nttdata.creational.abstractfactory.phone.factory.abstractfactory.RegrasPaisesAbstractFactory;
import com.nttdata.creational.abstractfactory.phone.model.celular.Celular;
import com.nttdata.creational.abstractfactory.phone.model.celular.MotorolaEdge50Pro;

import java.math.BigDecimal;

public class MotorolaEdge50ProFactory implements CelularFactory {
    RegrasPaisesAbstractFactory rules;

    public MotorolaEdge50ProFactory(RegrasPaisesAbstractFactory rules) {
        this.rules = rules;
    }

    @Override
    public Celular criarCelular() {
        Celular motorolaEdge50Pro = new MotorolaEdge50Pro(rules);
        motorolaEdge50Pro.setId(2L);
        motorolaEdge50Pro.setNome("Motorola Edge 50 Pro");
        motorolaEdge50Pro.setSistemaOperacional("Android 14");
        motorolaEdge50Pro.setPreco(new BigDecimal("3149.10"));

        motorolaEdge50Pro.criarCertificado();
        motorolaEdge50Pro.empacotar();

       return motorolaEdge50Pro;
    }
}
