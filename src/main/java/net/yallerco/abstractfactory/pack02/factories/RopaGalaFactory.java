package net.yallerco.abstractfactory.pack02.factories;

import net.yallerco.abstractfactory.pack02.RopasFactory;
import net.yallerco.abstractfactory.pack02.productos.*;
import net.yallerco.abstractfactory.pack02.productos.camisa.CamisaGala;
import net.yallerco.abstractfactory.pack02.productos.pantalon.PantalonGala;
import net.yallerco.abstractfactory.pack02.productos.zapatos.ZapatosGala;

public class RopaGalaFactory implements RopasFactory {
    @Override
    public Zapatos crearZapatos() {
        return new ZapatosGala();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaGala();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonGala();
    }
}
