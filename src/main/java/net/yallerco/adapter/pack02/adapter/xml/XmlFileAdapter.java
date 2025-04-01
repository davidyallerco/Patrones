package net.yallerco.adapter.pack02.adapter.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import net.yallerco.adapter.pack02.model.Persona;
import net.yallerco.adapter.pack02.adapter.IInputFile;

import java.io.InputStream;
import java.util.List;

public class XmlFileAdapter implements IInputFile {
    @Override
    public List<Persona> leerArchivo(InputStream inputStream) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            PeopleWrapperXml peopleWrapperXml = xmlMapper.readValue(inputStream, PeopleWrapperXml.class);
            List<Persona> personList = peopleWrapperXml.getPersonas();
            return personList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
