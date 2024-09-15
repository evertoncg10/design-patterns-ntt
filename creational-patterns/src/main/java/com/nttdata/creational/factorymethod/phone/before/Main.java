package com.nttdata.creational.factorymethod.phone.before;

import com.nttdata.creational.factorymethod.phone.before.model.Celular;
import com.nttdata.creational.factorymethod.phone.before.model.IphoneXSMax;
import com.nttdata.creational.factorymethod.phone.before.model.MotorolaEdge50Pro;
import com.nttdata.creational.factorymethod.phone.before.model.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;

public class Main {

    private static long ID_CELULAR = 3L;

    public static void main(String[] args) {

        Celular celular = null;

        if (ID_CELULAR == 1) {
            celular = new IphoneXSMax();
            celular.setId(1L);
            celular.setNome("IPhone XS Max");
            celular.setSistemaOperacional("IOS 17");
            celular.setPreco(new BigDecimal("14000.00"));
        } else if (ID_CELULAR == 2) {
            celular = new MotorolaEdge50Pro();
            celular.setId(2L);
            celular.setNome("Motorola Edge 50 Pro");
            celular.setSistemaOperacional("Android 14");
            celular.setPreco(new BigDecimal("3149.10"));
        } else if (ID_CELULAR == 3) {
            celular = new SamsungGalaxyS24Ultra();
            celular.setId(3L);
            celular.setNome("Samsung Galaxy S24 Ultra");
            celular.setSistemaOperacional("Android 15");
            celular.setPreco(new BigDecimal("9000.00"));
        }

        System.out.println(celular.toString());
    }
}
