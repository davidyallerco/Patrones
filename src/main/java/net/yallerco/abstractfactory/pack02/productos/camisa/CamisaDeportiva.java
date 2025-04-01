package net.yallerco.abstractfactory.pack02.productos.camisa;

import net.yallerco.abstractfactory.pack02.productos.Camisa;

public class CamisaDeportiva implements Camisa {


    @Override
    public boolean tieneMangaLarga() {
        System.out.println("Camisa deportiva -- tiene manga larga --> NO");
        return false;
    }

    @Override
    public boolean tieneBotones() {
        System.out.println("Camisa deportiva -- tiene botones --> NO");
        return false;
    }
}
