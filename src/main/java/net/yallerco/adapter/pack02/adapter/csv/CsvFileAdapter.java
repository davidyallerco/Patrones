package net.yallerco.adapter.pack02.adapter.csv;

import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import net.yallerco.adapter.pack02.model.Persona;
import net.yallerco.adapter.pack02.adapter.IInputFile;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class CsvFileAdapter implements IInputFile {

    @Override
    public List<Persona> leerArchivo(InputStream inputStream) {
        Reader reader = new InputStreamReader(inputStream);

        ColumnPositionMappingStrategy<Persona> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Persona.class);
        strategy.setColumnMapping("nombre","apellido","edad");

        CsvToBean<Persona> csvToBean = new CsvToBeanBuilder<Persona>(reader)
                .withMappingStrategy(strategy)
                .withType(Persona.class)
                .withSeparator(';')
                .withSkipLines(1)
                .withIgnoreLeadingWhiteSpace(true)
                .build();

        List<Persona> personList = csvToBean.parse();
        return personList;
    }
}