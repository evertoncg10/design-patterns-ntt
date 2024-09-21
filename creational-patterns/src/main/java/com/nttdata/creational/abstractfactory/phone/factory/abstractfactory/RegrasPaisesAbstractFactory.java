package com.nttdata.creational.abstractfactory.phone.factory.abstractfactory;

import com.nttdata.creational.abstractfactory.phone.model.certificado.CertificadoGarantia;
import com.nttdata.creational.abstractfactory.phone.model.empacotamento.Empacotamento;

public interface RegrasPaisesAbstractFactory {
    CertificadoGarantia getCertificados();

    Empacotamento getEmpacotamento();
}
