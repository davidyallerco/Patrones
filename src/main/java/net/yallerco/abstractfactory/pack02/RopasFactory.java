package net.yallerco.abstractfactory.pack02;

import net.yallerco.abstractfactory.pack02.productos.Camisa;
import net.yallerco.abstractfactory.pack02.productos.Pantalon;
import net.yallerco.abstractfactory.pack02.productos.Zapatos;

public interface RopasFactory {
    Zapatos crearZapatos();
    Camisa crearCamisa();
    Pantalon crearPantalon();
}
