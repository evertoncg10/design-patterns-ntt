package com.nttdata.creational.abstractfactory.phone.factory.abstractfactory;

import com.nttdata.creational.abstractfactory.phone.model.certificado.CertificadoGarantia;
import com.nttdata.creational.abstractfactory.phone.model.certificado.CertificadoGarantiaUSA;
import com.nttdata.creational.abstractfactory.phone.model.empacotamento.Empacotamento;
import com.nttdata.creational.abstractfactory.phone.model.empacotamento.EmpacotamentoUSA;

public class RegrasUSAAbstractFactory implements RegrasPaisesAbstractFactory {

    public CertificadoGarantia getCertificados() {
        return new CertificadoGarantiaUSA();
    }

    public Empacotamento getEmpacotamento() {
        return new EmpacotamentoUSA();
    }

}
