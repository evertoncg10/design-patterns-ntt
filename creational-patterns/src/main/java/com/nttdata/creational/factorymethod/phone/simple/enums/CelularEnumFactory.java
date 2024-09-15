package com.nttdata.creational.factorymethod.phone.simple.enums;



import com.nttdata.creational.factorymethod.phone.simple.model.Celular;
import com.nttdata.creational.factorymethod.phone.simple.model.IphoneXSMax;
import com.nttdata.creational.factorymethod.phone.simple.model.MotorolaEdge50Pro;
import com.nttdata.creational.factorymethod.phone.simple.model.SamsungGalaxyS24Ultra;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Optional;

public enum CelularEnumFactory {

    IPHONE_XS_MAX(1, new IphoneXSMax()) {
        @Override
        Celular criarCelular() {
            Celular celular = new IphoneXSMax();
            celular.setId(1);
            celular.setNome("Iphone XS Max");
            celular.setSistemaOperacional("IOS 17");
            celular.setPreco(BigDecimal.valueOf(14000.00));
            return celular;
        }
    },
    MOTOROLA_EDGE_50_PRO(2, new MotorolaEdge50Pro()) {
        @Override
        Celular criarCelular() {
            Celular celular = new MotorolaEdge50Pro();
            celular.setId(2);
            celular.setNome("Motorola Edge 50 Pro");
            celular.setSistemaOperacional("Android 15");
            celular.setPreco(BigDecimal.valueOf(3149.10));
            return celular;
        }
    },
    SAMSUNG_GALAXY_S24_ULTRA(3, new SamsungGalaxyS24Ultra()) {
        @Override
        Celular criarCelular() {
            Celular celular = new SamsungGalaxyS24Ultra();
            celular.setId(3);
            celular.setNome("Samsung Galaxy S24 Ultra");
            celular.setSistemaOperacional("Android 13");
            celular.setPreco(BigDecimal.valueOf(1439.99));
            return celular;
        }
    };

    private final int idCelular;
    private final Celular celular;

    CelularEnumFactory(int idCelular, Celular celular) {
        this.idCelular = idCelular;
        this.celular = celular;
    }

    abstract Celular criarCelular();

    public int getIdCelular() {
        return idCelular;
    }

    public static Celular retornaEnumStrategy(int idCelular) {
        Optional<CelularEnumFactory> factory = Arrays.stream(CelularEnumFactory.values())
                .filter(n -> idCelular == n.getIdCelular())
                .findFirst();

        return factory.map(CelularEnumFactory::criarCelular).orElse(null);
    }
}
