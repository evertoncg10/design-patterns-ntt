package com.nttdata.creational.factorymethod.phone.factory;

import com.nttdata.creational.factorymethod.phone.factory.model.Celular;
import com.nttdata.creational.factorymethod.phone.factory.model.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;

public class SamsungGalaxyS24UltraFactory implements CelularFactory {
    @Override
    public Celular criarCelular() {
        Celular samsungGalaxyS24Ultra = new SamsungGalaxyS24Ultra();
        samsungGalaxyS24Ultra.setId(3L);
        samsungGalaxyS24Ultra.setNome("Samsung Galaxy S24 Ultra");
        samsungGalaxyS24Ultra.setSistemaOperacional("Android 15");
        samsungGalaxyS24Ultra.setPreco(new BigDecimal("9000.00"));
        return samsungGalaxyS24Ultra;
    }
}
