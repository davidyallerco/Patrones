package net.yallerco.adapter.pack02.adapter;

import net.yallerco.adapter.pack02.model.Persona;

import java.io.InputStream;
import java.util.List;

public class FileAdapter {
    private IInputFile iInputFile;

    public FileAdapter(IInputFile iInputFile) {
        this.iInputFile = iInputFile;
    }

    public List<Persona> leerFile(InputStream inputStream){
        return this.iInputFile.leerArchivo(inputStream);
    }
}
