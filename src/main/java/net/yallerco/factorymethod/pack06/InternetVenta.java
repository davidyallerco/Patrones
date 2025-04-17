package net.yallerco.factorymethod.pack06;

public class InternetVenta implements IVenta{

    private Double descuento;

    public InternetVenta(Double descuento){
        this.descuento = descuento;
    }

    @Override
    public void vender(double total) {
        System.out.println("La venta de INTERNET tiene un total de " + (total - this.descuento));
    }
}
