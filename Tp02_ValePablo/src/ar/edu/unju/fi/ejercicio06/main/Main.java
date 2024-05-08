package ar.edu.unju.fi.ejercicio06.main;

import ar.edu.unju.fi.ejercicio06.interfaces.funcional.Converter;
import ar.edu.unju.fi.ejercicio06.model.FelinoDomestico;
import ar.edu.unju.fi.ejercicio06.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		FelinoDomestico gato = new FelinoDomestico("Garfield", (byte)45, 12f);
		Converter<FelinoDomestico, FelinoSalvaje> converter = x -> new FelinoSalvaje(x.getNombre(),
				x.getEdad(), x.getPeso());
		FelinoSalvaje felino1= converter.convert(gato);
		//converter.mostrarObjetos(felino1);
		FelinoSalvaje gato1= new FelinoSalvaje("Tanner", (byte)20, 186f);
		Converter<FelinoSalvaje, FelinoDomestico> converter1 = x -> new FelinoDomestico(x.getNombre(),
				x.getEdad(), x.getPeso());
		FelinoDomestico gato2=converter1.convert(gato1);
		//converter1.mostrarObjetos(gato2);
		converter1.mostrarObjetos(felino1);
		converter.mostrarObjetos(gato2);
	}

}
