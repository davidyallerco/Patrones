package net.yallerco.factorymethod.pack06;

public class InternetVentaFactory extends VentaFactory{

    private Double descuento;

    public InternetVentaFactory(Double descuento){
        this.descuento = descuento;
    }

    @Override
    public IVenta obtenerVenta()  {
        return new InternetVenta(this.descuento);
    }
}
