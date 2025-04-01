package net.yallerco.adapter.pack02;

import net.yallerco.adapter.pack02.adapter.*;
import net.yallerco.adapter.pack02.model.Persona;
import net.yallerco.adapter.pack02.adapter.xml.XmlFileAdapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Principal {
    private static final String ruta =
            "src" + File.separator +
                    "main" + File.separator +
                    "resources" + File.separator +
                    "files" + File.separator;

    public static void main(String[] args) throws FileNotFoundException {
        //leer excel
        /*
        IInputFile iInputFile = new ExcelFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(iInputFile);

        InputStream inputStream = new FileInputStream(ruta+"archivo.xlsx");

*/
        // Read CSV
/*
        IInputFile csvFileAdapter = new CsvFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(csvFileAdapter);
        InputStream inputStream = new FileInputStream(ruta + "archivo.csv");

*/
        // Read XML

        IInputFile iInputFile = new XmlFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(iInputFile);
        InputStream inputStream = new FileInputStream(ruta + "archivo.xml");


        // Read JSON
        /*
        IInputFile iInputFile = new JsonFileAdapter();
        FileAdapter fileAdapter = new FileAdapter(iInputFile);
        InputStream inputStream = new FileInputStream(ruta + "archivo.json");
        */



        List<Persona> personas = fileAdapter.leerFile(inputStream);
        System.out.println(personas);
    }
}
