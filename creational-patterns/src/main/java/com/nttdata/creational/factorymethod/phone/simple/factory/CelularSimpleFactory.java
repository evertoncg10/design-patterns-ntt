package com.nttdata.creational.factorymethod.phone.simple.factory;

import com.nttdata.creational.factorymethod.phone.simple.model.Celular;
import com.nttdata.creational.factorymethod.phone.simple.model.IphoneXSMax;
import com.nttdata.creational.factorymethod.phone.simple.model.MotorolaEdge50Pro;
import com.nttdata.creational.factorymethod.phone.simple.model.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;

public class CelularSimpleFactory {

    public static Celular criarCelular(int idCelular) {

        Celular celular = null;

        if (idCelular == 1) {
            celular = new IphoneXSMax();
            celular.setId(1);
            celular.setNome("Iphone XS Max");
            celular.setSistemaOperacional("IOS 17");
            celular.setPreco(BigDecimal.valueOf(14000.00));
        } else if (idCelular == 2) {
            celular = new MotorolaEdge50Pro();
            celular.setId(2);
            celular.setNome("Motorola Edge 50 Pro");
            celular.setSistemaOperacional("Android 15");
            celular.setPreco(BigDecimal.valueOf(3149.10));
        } else if (idCelular == 3) {
            celular = new SamsungGalaxyS24Ultra();
            celular.setId(3);
            celular.setNome("Samsung Galaxy S24 Ultra");
            celular.setSistemaOperacional("Android 13");
            celular.setPreco(BigDecimal.valueOf(1439.99));
        }

//        celular = CelularEnumFactory.retornaEnumStrategy(1);

        return celular;
    }
}
