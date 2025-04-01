package net.yallerco.abstractfactory.pack02.productos.zapatos;

import net.yallerco.abstractfactory.pack02.productos.Zapatos;

public class ZapatosGala implements Zapatos {
    @Override
    public boolean esZapatoElegante() {
        System.out.println("Zapatos de gala -- Son zapatos elegantes? --> SI");
        return true;
    }

    @Override
    public boolean esZapatoParaCorrer() {
        System.out.println("Zapatos de gala -- Son zapatos para correr? --> NO");
        return false;
    }
}
