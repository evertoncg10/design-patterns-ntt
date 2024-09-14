package com.nttdata.creational.factorymethod.phone.factory.main;

import com.nttdata.creational.factorymethod.phone.factory.IphoneXSMaxFactory;
import com.nttdata.creational.factorymethod.phone.factory.MotorolaEdge50ProFactory;
import com.nttdata.creational.factorymethod.phone.factory.SamsungGalaxyA32Factory;
import com.nttdata.creational.factorymethod.phone.factory.SamsungGalaxyS24UltraFactory;
import com.nttdata.creational.factorymethod.phone.factory.enums.CelularEnumFactory;
import com.nttdata.creational.factorymethod.phone.factory.model.Celular;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Celular celularComIf = getCelularComIf(1);
        System.out.println(celularComIf.toString());

        Celular celularComSwitch = getCelularComSwitch(2);
        System.out.println(celularComSwitch.toString());

        Celular celularComEnum = getCelularComEnum(3);
        System.out.println(celularComEnum.toString());

        Celular celularComMap = getCelularComMap(4);
        System.out.println(celularComMap.toString());
    }

    public static Celular getCelularComIf(int idCelular) {
        Celular celular = null;

        if (idCelular == 1) {
            celular = new IphoneXSMaxFactory().criarCelular();
        } else if (idCelular == 2) {
            celular = new MotorolaEdge50ProFactory().criarCelular();
        } else if (idCelular == 3) {
            celular = new SamsungGalaxyS24UltraFactory().criarCelular();
        }
        return celular;
    }

    public static Celular getCelularComSwitch(int idCelular) {
        Celular celular = null;

        switch (idCelular) {
            case 1:
                celular = new IphoneXSMaxFactory().criarCelular();
                break;
            case 2:
                celular = new MotorolaEdge50ProFactory().criarCelular();
                break;
            case 3:
                celular = new SamsungGalaxyS24UltraFactory().criarCelular();
                break;
        }
        return celular;
    }

    public static Celular getCelularComEnum(int idCelular) {
        return CelularEnumFactory.retornaEnumStrategy(idCelular);
    }

    public static Celular getCelularComMap(int idCelular) {
        Map<Integer, Celular> celulares = new HashMap<>();
        celulares.put(1, new IphoneXSMaxFactory().criarCelular());
        celulares.put(2, new MotorolaEdge50ProFactory().criarCelular());
        celulares.put(3, new SamsungGalaxyS24UltraFactory().criarCelular());
        celulares.put(4, new SamsungGalaxyA32Factory().criarCelular());

        return celulares.get(idCelular);
    }
}
