package net.yallerco.factorymethod.pack04.model;

import net.yallerco.factorymethod.pack04.Vehiculo;

public class Carro implements Vehiculo {
    @Override
    public void start() {
        System.out.println("Arrancar carro");
    }

    @Override
    public void stop() {
        System.out.println("Parar carro");
    }
}
