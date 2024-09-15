package com.nttdata.creational.factorymethod.phone.halfSimple;

import com.nttdata.creational.factorymethod.phone.halfSimple.model.Celular;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.Iphone11Pro;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.IphoneX;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.IphoneXSMax;

import java.math.BigDecimal;

public class IphoneFactory implements CelularFactory {
    @Override
    public Celular criarCelular(int idCelular) {
        Celular celular = null;
        switch (idCelular) {
            case 1:
                celular = new IphoneXSMax();
                celular.setId(1);
                celular.setNome("IPhone XS Max");
                celular.setSistemaOperacional("IOS 17");
                celular.setPreco(BigDecimal.valueOf(14000.00));
                break;
            case 11:
                celular = new IphoneX();
                celular.setId(11);
                celular.setNome("IPhone X");
                celular.setSistemaOperacional("IOS 17");
                celular.setPreco(BigDecimal.valueOf(8500.00));
                break;
            case 111:
                celular = new Iphone11Pro();
                celular.setId(111);
                celular.setNome("IPhone 11 Pro");
                celular.setSistemaOperacional("IOS 16");
                celular.setPreco(BigDecimal.valueOf(5000.00));
                break;
        }
        return celular;
    }
}
