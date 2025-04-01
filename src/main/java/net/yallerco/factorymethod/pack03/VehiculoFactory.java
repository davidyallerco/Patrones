package net.yallerco.factorymethod.pack03;

import net.yallerco.factorymethod.pack03.model.Avion;
import net.yallerco.factorymethod.pack03.model.Camion;
import net.yallerco.factorymethod.pack03.model.Carro;
import net.yallerco.factorymethod.pack03.model.Moto;

public class VehiculoFactory {
    public Vehiculo crearVehiculo(String typeDeVehiculo){

        if (typeDeVehiculo.equalsIgnoreCase("Carro")){
            return new Carro();
        }
        if (typeDeVehiculo.equalsIgnoreCase("Moto")){
            return new Moto();
        }
        if (typeDeVehiculo.equalsIgnoreCase("Camion")){
            return new Camion();
        }
        if (typeDeVehiculo.equalsIgnoreCase("Avion")){
            return new Avion();
        }
        return null;
    }
}
