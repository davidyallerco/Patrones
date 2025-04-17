package net.yallerco.factorymethod.pack06;

public class Principal {
    public static void main(String[] args) {
        VentaFactory storeVentaFactory = new StoreVentaFactory(10.0);
        VentaFactory internetVentaFactory = new InternetVentaFactory(2.0);

        IVenta venta1 = storeVentaFactory.obtenerVenta();
        venta1.vender(15);

        IVenta venta2 = internetVentaFactory.obtenerVenta();
        venta2.vender(15);
    }
}
