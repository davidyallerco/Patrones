package net.yallerco.adapter.pack02.adapter;

import net.yallerco.adapter.pack02.model.Persona;

import java.io.InputStream;
import java.util.List;

public interface IInputFile {
    List<Persona> leerArchivo(InputStream inputStream);
}
