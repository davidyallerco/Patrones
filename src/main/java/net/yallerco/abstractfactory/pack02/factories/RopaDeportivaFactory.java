package net.yallerco.abstractfactory.pack02.factories;

import net.yallerco.abstractfactory.pack02.RopasFactory;
import net.yallerco.abstractfactory.pack02.productos.*;
import net.yallerco.abstractfactory.pack02.productos.camisa.CamisaDeportiva;
import net.yallerco.abstractfactory.pack02.productos.pantalon.PantalonDeportivo;
import net.yallerco.abstractfactory.pack02.productos.zapatos.ZapatosDeportivos;

public class RopaDeportivaFactory implements RopasFactory {
    @Override
    public Zapatos crearZapatos() {
        return new ZapatosDeportivos();
    }

    @Override
    public Camisa crearCamisa() {
        return new CamisaDeportiva();
    }

    @Override
    public Pantalon crearPantalon() {
        return new PantalonDeportivo();
    }
}
