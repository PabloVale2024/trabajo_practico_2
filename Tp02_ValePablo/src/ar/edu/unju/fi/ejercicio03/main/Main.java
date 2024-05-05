package ar.edu.unju.fi.ejercicio03.main;


import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio03.constantes.Provincias;

public class Main {

	public static void main(String[] args) {
		//System.out.println(Provincias.JUJUY.getCantidadPoblacion());
		Provincias[] provincias;
		provincias=Provincias.values();
		System.out.println("Mostrar Provincias");
		for (Provincias i : provincias) {
			System.out.println("\nPROVINCIA: "+ i.name() +"\nPoblacion: "+ i.getCantidadPoblacion()+"\nSuperficie: "+i.getSuperficie());
			System.out.println("Densidad: "+ i.calcularDensidad(i.getCantidadPoblacion(), i.getSuperficie()));
		}
	}

}
