package net.yallerco.abstractfactory.pack01;

/**
 * Created by albertopalomarrobledo on 18/7/19.
 */
public interface AbstractFactory<T> {
    T create(String type);
}
