package net.yallerco.builder.pack05;

public class Main {

	public static void main(String[] args) {

		Persona madre = new Persona.Builder("Maria")
				.setMunicipio("Selva")
				.setMayor(37)
				.setLugarTrabajo("Google")
				.build();

		Persona hijo = new Persona.Builder("Pedro")
				.setMenor(4)
				.setColegio("Colegio de Selva")
				.build();

		// esta codigo NO debe compilar, porque una persona mayor trabaja no deberia estar en el colegio
		/*
		Persona mal = new Persona.Builder("Luisa")
				    .setMayor(20)
				    .setColegio("Colegio de Villa Arriba")
				    .build();
        */

	}


}
