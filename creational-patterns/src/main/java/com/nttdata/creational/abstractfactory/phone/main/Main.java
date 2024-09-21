package com.nttdata.creational.abstractfactory.phone.main;

import com.nttdata.creational.abstractfactory.phone.factory.CelularFactory;
import com.nttdata.creational.abstractfactory.phone.factory.IphoneXSMaxFactory;
import com.nttdata.creational.abstractfactory.phone.factory.MotorolaEdge50ProFactory;
import com.nttdata.creational.abstractfactory.phone.factory.SamsungGalaxyA32Factory;
import com.nttdata.creational.abstractfactory.phone.factory.abstractfactory.RegrasBrasilAbstractFactory;
import com.nttdata.creational.abstractfactory.phone.factory.abstractfactory.RegrasPaisesAbstractFactory;

public class Main {
    public static void main(String[] args) {
        RegrasPaisesAbstractFactory rules = new RegrasBrasilAbstractFactory();

//        RegrasPaisesAbstractFactory rules = new RegrasUSAAbstractFactory();

        CelularFactory iphoneXSMax = new IphoneXSMaxFactory(rules);
        CelularFactory motorolaEdge50Pro = new MotorolaEdge50ProFactory(rules);
        CelularFactory samsungGalaxyS24Ultra = new SamsungGalaxyA32Factory(rules);

        System.out.println(iphoneXSMax.criarCelular());
        System.out.println(motorolaEdge50Pro.criarCelular());
        System.out.println(samsungGalaxyS24Ultra.criarCelular());

    }


}
