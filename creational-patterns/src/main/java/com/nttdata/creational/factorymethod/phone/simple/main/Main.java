package com.nttdata.creational.factorymethod.phone.simple.main;

import com.nttdata.creational.factorymethod.phone.simple.factory.CelularSimpleFactory;
import com.nttdata.creational.factorymethod.phone.simple.model.Celular;

public class Main {

    public static void main(String[] args) {
        Celular celular = CelularSimpleFactory.criarCelular(1);
        System.out.println(celular.toString());
    }


}
