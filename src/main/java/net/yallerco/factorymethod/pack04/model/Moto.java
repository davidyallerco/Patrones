package net.yallerco.factorymethod.pack04.model;

import net.yallerco.factorymethod.pack04.Vehiculo;

public class Moto implements Vehiculo {
    @Override
    public void start() {
        System.out.println("Arrancar moto");
    }

    @Override
    public void stop() {
        System.out.println("Parar moto");
    }
}
