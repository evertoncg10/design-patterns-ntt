package com.nttdata.creational.factorymethod.phone.halfSimple;

import com.nttdata.creational.factorymethod.phone.halfSimple.model.Celular;

public interface CelularFactory {
    Celular criarCelular(int idCelular);

}
