package com.nttdata.creational.factorymethod.phone.factory;

import com.nttdata.creational.factorymethod.phone.factory.model.Celular;
import com.nttdata.creational.factorymethod.phone.factory.model.IphoneXSMax;

import java.math.BigDecimal;
public class IphoneXSMaxFactory implements CelularFactory {
    @Override
    public Celular criarCelular() {
        Celular iphoneXSMax = new IphoneXSMax();
        iphoneXSMax.setId(1L);
        iphoneXSMax.setNome("IPhone XS Max");
        iphoneXSMax.setSistemaOperacional("IOS 17");
        iphoneXSMax.setPreco(new BigDecimal("14000.00"));
        return iphoneXSMax;
    }
}
