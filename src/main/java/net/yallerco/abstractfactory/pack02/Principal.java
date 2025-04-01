package net.yallerco.abstractfactory.pack02;

import net.yallerco.abstractfactory.pack02.factories.RopaDeportivaFactory;
import net.yallerco.abstractfactory.pack02.productos.Camisa;
import net.yallerco.abstractfactory.pack02.productos.camisa.CamisaDeportiva;
import net.yallerco.abstractfactory.pack02.productos.pantalon.PantalonDeportivo;
import net.yallerco.abstractfactory.pack02.productos.zapatos.ZapatosDeportivos;

public class Principal {
    public static void main(String[] args) {
        RopasFactory ropaDeportivaFactory = new RopaDeportivaFactory();

        CamisaDeportiva camisaDeportiva = (CamisaDeportiva) ropaDeportivaFactory.crearCamisa();
        ZapatosDeportivos zapatosDeportivos = (ZapatosDeportivos) ropaDeportivaFactory.crearZapatos();
        PantalonDeportivo pantalonDeportivo = (PantalonDeportivo) ropaDeportivaFactory.crearPantalon();

        System.out.println("\n ----> Ejemplo de ropa deportiva <---");
        camisaDeportiva.tieneBotones();
        pantalonDeportivo.tieneCierre();
        zapatosDeportivos.esZapatoParaCorrer();
    }
}
