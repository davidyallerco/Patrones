package net.yallerco.prototype.pack03;

import java.util.ArrayList;
import java.util.List;

public class ListaPrecios implements IPrototype{

    private String nombre;
    private List<Producto> listaProductos = new ArrayList<>();

    public ListaPrecios(String nombre){
        this.nombre = nombre;
    }
    @Override
    public IPrototype clone() {
        ListaPrecios clone = new ListaPrecios(nombre);
        clone.setListaProductos(listaProductos);
        return clone;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
