package com.nttdata.creational.factorymethod.phone.halfSimple;

import com.nttdata.creational.factorymethod.phone.halfSimple.model.Celular;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.MotorolaEdge50Pro;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.MotorolaRazr40;

import java.math.BigDecimal;

public class MotorolaFactory implements CelularFactory {
    @Override
    public Celular criarCelular(int idCelular) {
        Celular celular = null;
        switch (idCelular) {
            case 2:
                celular = new MotorolaEdge50Pro();
                celular.setId(2);
                celular.setNome("Motorola Edge 50 Pro");
                celular.setSistemaOperacional("Android 15");
                celular.setPreco(BigDecimal.valueOf(3149.10));
                break;
            case 22:
                celular = new MotorolaRazr40();
                celular.setId(22);
                celular.setNome("Motorola razr 40");
                celular.setSistemaOperacional("Android 15");
                celular.setPreco(BigDecimal.valueOf(3890.99));
                break;
        }
        return celular;
    }
}
