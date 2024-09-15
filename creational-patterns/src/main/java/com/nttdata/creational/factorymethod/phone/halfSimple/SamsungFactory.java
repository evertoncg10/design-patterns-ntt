package com.nttdata.creational.factorymethod.phone.halfSimple;

import com.nttdata.creational.factorymethod.phone.halfSimple.model.Celular;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.SamsungGalaxyA55;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;

public class SamsungFactory implements CelularFactory {
    @Override
    public Celular criarCelular(int idCelular) {
        Celular celular = null;
        switch (idCelular) {
            case 3:
                celular = new SamsungGalaxyS24Ultra();
                celular.setId(3);
                celular.setNome("Samsung Galaxy S24 Ultra ");
                celular.setSistemaOperacional("Android 15");
                celular.setPreco(BigDecimal.valueOf(6500.00));
                break;
            case 33:
                celular = new SamsungGalaxyA55();
                celular.setId(33);
                celular.setNome("Samsung Galaxy A55");
                celular.setSistemaOperacional("Android 14");
                celular.setPreco(BigDecimal.valueOf(2350.99));
                break;
        }

        return celular;

    }
}
