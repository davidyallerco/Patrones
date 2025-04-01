package net.yallerco.abstractfactory.pack02.productos.pantalon;

import net.yallerco.abstractfactory.pack02.productos.Pantalon;

public class PantalonDeportivo implements Pantalon {
    @Override
    public boolean tienenBolsillos() {
        System.out.println("Pantalones deportivos -- Tienen bolsillos? --> NO");
        return false;
    }

    @Override
    public boolean tieneCierre() {
        System.out.println("Pantalones deportivos -- Tiene cierre? --> NO");
        return false;
    }
}
