package net.yallerco.factorymethod.pack06;
//concret creator
public class StoreVentaFactory extends VentaFactory {

    private Double extra;

    public StoreVentaFactory(Double extra){
        this.extra = extra;
    }

    @Override
    public IVenta obtenerVenta() {
        return new StoreVenta(this.extra);
    }
}
