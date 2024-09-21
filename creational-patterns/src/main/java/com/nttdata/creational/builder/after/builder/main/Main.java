package com.nttdata.creational.builder.after.builder.main;

import com.nttdata.creational.builder.after.builder.builders.CaminhaoBuilder;
import com.nttdata.creational.builder.after.builder.builders.CarroBuilder;
import com.nttdata.creational.builder.after.builder.diretor.Diretor;
import com.nttdata.creational.builder.after.builder.models.Caminhao;
import com.nttdata.creational.builder.after.builder.models.Carro;

public class Main {

    public static void main(String[] args) {
        Diretor diretor = Diretor.diretor();
        CarroBuilder builder = CarroBuilder.carroBuilder();

        diretor.constructSedanCar(builder);

        Carro carro = builder.build();
        System.out.println(carro.getTipoCarro() + " produzido com sucesso!");

        CaminhaoBuilder truckBuilder = new CaminhaoBuilder();
        diretor.constructTruck(truckBuilder);

        Caminhao caminhao = truckBuilder.build();
        System.out.println("Caminhão: " + caminhao.result());

    }
}
