package net.yallerco.factorymethod.pack04.factory;

import net.yallerco.factorymethod.pack04.Vehiculo;
import net.yallerco.factorymethod.pack04.model.Moto;

public class MotoFactory extends VehiculoFactory {
    @Override
    public Vehiculo createVehiculo() {
        return new Moto();
    }
}
