package net.yallerco.factorymethod.pack06;

//fabrica que va crear productos
public class StoreVenta implements IVenta{
    private Double extra;

    public StoreVenta(Double extra){
        this.extra = extra;
    }

    @Override
    public void vender(double total) {
        System.out.println("La venta en tienda tiene un total de " + total + this.extra);
    }
}
