package net.yallerco.abstractfactory.pack02.productos.pantalon;

import net.yallerco.abstractfactory.pack02.productos.Pantalon;

public class PantalonGala implements Pantalon {
    @Override
    public boolean tienenBolsillos() {
        System.out.println("Pantalones Gala -- Tienen bolsillos? --> SI");
        return true;
    }

    @Override
    public boolean tieneCierre() {
        System.out.println("Pantalones Gala -- Tiene cierre? --> SI");
        return true;
    }
}
