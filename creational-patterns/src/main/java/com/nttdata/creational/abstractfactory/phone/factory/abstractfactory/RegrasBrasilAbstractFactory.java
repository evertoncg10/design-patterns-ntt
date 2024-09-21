package com.nttdata.creational.abstractfactory.phone.factory.abstractfactory;

import com.nttdata.creational.abstractfactory.phone.model.certificado.CertificadoGarantia;
import com.nttdata.creational.abstractfactory.phone.model.certificado.CertificadoGarantiaBrasil;
import com.nttdata.creational.abstractfactory.phone.model.empacotamento.Empacotamento;
import com.nttdata.creational.abstractfactory.phone.model.empacotamento.EmpacotamentoBrasil;


public class RegrasBrasilAbstractFactory implements RegrasPaisesAbstractFactory {

    public CertificadoGarantia getCertificados() {
        return new CertificadoGarantiaBrasil();
    }

    public Empacotamento getEmpacotamento() {
        return new EmpacotamentoBrasil();
    }

}
