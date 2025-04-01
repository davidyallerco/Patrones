package net.yallerco.factorymethod.pack04;

import net.yallerco.factorymethod.pack04.factory.AvionFactory;
import net.yallerco.factorymethod.pack04.factory.CarroFactory;

public class Principal {
    public static void main(String[] args) {
        Vehiculo carro = new CarroFactory().createVehiculo();
        Vehiculo avion = new AvionFactory().createVehiculo();
        carro.start();
        avion.start();
    }
}
