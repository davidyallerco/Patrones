package net.yallerco.adapter.pack02.adapter.excel;

import net.yallerco.adapter.pack02.model.Persona;
import net.yallerco.adapter.pack02.adapter.IInputFile;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelFileAdapter implements IInputFile {

    @Override
    public List<Persona> leerArchivo(InputStream inputStream) {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);

            List<Persona> personas = new ArrayList<>();
            for (int i = 1 ; i < sheet.getPhysicalNumberOfRows(); i++){
                Row row = sheet.getRow(i);
                int cell = row.getFirstCellNum();

                Persona persona = new Persona();
                persona.setNombre(String.valueOf(row.getCell(cell)));
                persona.setApellido(String.valueOf(row.getCell(++cell)));
                persona.setEdad((int) row.getCell(++cell).getNumericCellValue());
                personas.add(persona);
            }
            workbook.close();
            return personas;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
