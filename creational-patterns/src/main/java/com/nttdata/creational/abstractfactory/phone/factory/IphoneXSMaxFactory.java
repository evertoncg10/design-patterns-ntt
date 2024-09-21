package com.nttdata.creational.abstractfactory.phone.factory;

import com.nttdata.creational.abstractfactory.phone.factory.abstractfactory.RegrasPaisesAbstractFactory;
import com.nttdata.creational.abstractfactory.phone.model.celular.Celular;
import com.nttdata.creational.abstractfactory.phone.model.celular.IphoneXSMax;

import java.math.BigDecimal;

public class IphoneXSMaxFactory implements CelularFactory {
    RegrasPaisesAbstractFactory rules;

    public IphoneXSMaxFactory(RegrasPaisesAbstractFactory rules) {
        this.rules = rules;
    }

    @Override
    public Celular criarCelular() {
        Celular iphoneXSMax = new IphoneXSMax(rules);
        iphoneXSMax.setId(1L);
        iphoneXSMax.setNome("IPhone XS Max");
        iphoneXSMax.setSistemaOperacional("IOS 17");
        iphoneXSMax.setPreco(new BigDecimal("14000.00"));

        iphoneXSMax.criarCertificado();
        iphoneXSMax.empacotar();

        return iphoneXSMax;
    }
}
