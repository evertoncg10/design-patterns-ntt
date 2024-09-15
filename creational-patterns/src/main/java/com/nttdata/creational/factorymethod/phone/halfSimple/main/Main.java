package com.nttdata.creational.factorymethod.phone.halfSimple.main;

import com.nttdata.creational.factorymethod.phone.halfSimple.IphoneFactory;
import com.nttdata.creational.factorymethod.phone.halfSimple.MotorolaFactory;
import com.nttdata.creational.factorymethod.phone.halfSimple.SamsungFactory;
import com.nttdata.creational.factorymethod.phone.halfSimple.model.Celular;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int idCelular = 22;

        String identificador = String.valueOf(idCelular).substring(0, 1);

        Celular celularComSwitch = getCelularComSwitch(idCelular, identificador);
        System.out.println(celularComSwitch.toString());

        Celular celularComMap = getCelularComMap(idCelular, identificador);
        System.out.println(celularComSwitch);


    }

    public static Celular getCelularComSwitch(int idCelular, String identificador) {
        Celular celular = null;

        switch (identificador) {
            case "1":
                celular = new IphoneFactory().criarCelular(idCelular);
                break;
            case "2":
                celular = new MotorolaFactory().criarCelular(idCelular);
                break;
            case "3":
                celular = new SamsungFactory().criarCelular(idCelular);
                break;
        }
        return celular;
    }

    public static Celular getCelularComMap(int idCelular, String identificador) {
        Map<String, Celular> mapCelular = new HashMap<>();
        mapCelular.put("1", new IphoneFactory().criarCelular(idCelular));
        mapCelular.put("2", new MotorolaFactory().criarCelular(idCelular));
        mapCelular.put("3", new SamsungFactory().criarCelular(idCelular));

        return mapCelular.get(identificador);
    }
}
