package net.yallerco.factorymethod.pack03;

public class Principal {
    public static void main(String[] args) {
        VehiculoFactory vehiculoFactory = new VehiculoFactory();

        Vehiculo carro = vehiculoFactory.crearVehiculo(TipoDeVehiculo.CARRO.name());
        Vehiculo camion = vehiculoFactory.crearVehiculo(TipoDeVehiculo.CAMION.name());
        Vehiculo obj3 = vehiculoFactory.crearVehiculo(TipoDeVehiculo.MOTO.name());
        Vehiculo obj4 = vehiculoFactory.crearVehiculo(TipoDeVehiculo.AVION.name());

        carro.start();
        camion.start();
        obj3.start();
        obj4.start();
    }
}
