package net.yallerco.abstractfactory.pack02.productos.zapatos;

import net.yallerco.abstractfactory.pack02.productos.Zapatos;

public class ZapatosDeportivos implements Zapatos {
    @Override
    public boolean esZapatoElegante() {
        System.out.println("Zapatos deportivos -- Son zapatos elegantes? --> NO");
        return false;
    }

    @Override
    public boolean esZapatoParaCorrer() {
        System.out.println("Zapatos deportivos -- Son zapatos para correr? --> SI");
        return true;
    }
}
