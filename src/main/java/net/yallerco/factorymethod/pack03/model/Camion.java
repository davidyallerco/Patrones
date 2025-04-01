package net.yallerco.factorymethod.pack03.model;

import net.yallerco.factorymethod.pack03.Vehiculo;

public class Camion implements Vehiculo {
    @Override
    public void start() {
        System.out.println("Arrancar camion");
    }

    @Override
    public void stop() {
        System.out.println("Parar camion");
    }
}
