package net.yallerco.prototype.pack03;

public interface IPrototype<T extends IPrototype> extends Cloneable{
    public T clone(); //clonacion simple
    public T deepClone();//clonacion profunda, incluye a objetos asociados
}
