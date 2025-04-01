package net.yallerco.builder.pack01;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


            Persona persona = new Persona.Builder("Juan")
                    .edad(30)
                    .direccion("Calle 123")
                    .telefono("123456789")
                    .build();

            System.out.println(persona);

    }
}