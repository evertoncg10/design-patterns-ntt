package com.nttdata.creational.factorymethod.phone.factory.enums;

import com.nttdata.creational.factorymethod.phone.factory.*;
import com.nttdata.creational.factorymethod.phone.factory.model.Celular;

import java.util.Arrays;
import java.util.Optional;

public enum CelularEnumFactory {

    IPHONE_XS_MAX(1, new IphoneXSMaxFactory()),
    MOTOROLA_EDGE_50_PRO(2, new MotorolaEdge50ProFactory()),
    SAMSUNG_GALAXY_S24_ULTRA(3, new SamsungGalaxyS24UltraFactory()),
    SAMSUNG_GALAXY_A32(4, new SamsungGalaxyA32Factory());


    private final int idCelular;
    private final CelularFactory factory;

    CelularEnumFactory(int idCelular, CelularFactory factory) {
        this.idCelular = idCelular;
        this.factory = factory;
    }

    public Celular criarCelular() {
        return factory.criarCelular();
    }

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
