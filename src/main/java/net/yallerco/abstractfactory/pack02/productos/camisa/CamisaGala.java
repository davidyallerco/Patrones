package net.yallerco.abstractfactory.pack02.productos.camisa;

import net.yallerco.abstractfactory.pack02.productos.Camisa;

public class CamisaGala implements Camisa {


    @Override
    public boolean tieneMangaLarga() {
        System.out.println("Camisa de gala -- tiene manga larga --> SI");
        return true;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa de gala -- tiene botones --> SI");
        return true;
    }
}
