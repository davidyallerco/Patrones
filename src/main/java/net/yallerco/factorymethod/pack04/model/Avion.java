package net.yallerco.factorymethod.pack04.model;

import net.yallerco.factorymethod.pack04.Vehiculo;

public class Avion implements Vehiculo {
    @Override
    public void start() {
        System.out.println("Arrancar avion");
    }

    @Override
    public void stop() {
        System.out.println("Parar avion");
    }

    public void volar(){
        System.out.println("Despegar avion");
    }
}
