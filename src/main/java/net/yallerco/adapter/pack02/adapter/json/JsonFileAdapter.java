package net.yallerco.adapter.pack02.adapter.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import net.yallerco.adapter.pack02.model.Persona;
import net.yallerco.adapter.pack02.adapter.IInputFile;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
public class JsonFileAdapter implements IInputFile {
    @Override
    public List<Persona> leerArchivo(InputStream inputStream) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(inputStream);

            for (JsonNode node : rootNode) {
                if (node instanceof ObjectNode) {
                    ObjectNode objectNode = (ObjectNode) node;

                    String nombre = objectNode.remove("Nombre").asText();
                    String apellido = objectNode.remove("Apellido").asText();
                    int edad = objectNode.remove("Edad").asInt();

                    objectNode.put("nombre", nombre);
                    objectNode.put("apellido", apellido);
                    objectNode.put("edad", edad);
                }
            }

            List<Persona> PersonaList = mapper.convertValue(rootNode, new TypeReference<List<Persona>>() {});
            return PersonaList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
