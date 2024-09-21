package com.nttdata.creational.abstractfactory.phone.model.celular;

import com.nttdata.creational.abstractfactory.phone.factory.abstractfactory.RegrasPaisesAbstractFactory;

public class IphoneXSMax extends Celular {
    public IphoneXSMax(RegrasPaisesAbstractFactory rules) {
        super(rules);
    }

    @Override
    public void criarCertificado() {
        System.out.println("Certificado IphoneXSMax");
        System.out.println(rules.getCertificados().criarCertificadoGarantia());
    }
}
