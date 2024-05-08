package ar.edu.unju.fi.ejercicio06.interfaces.funcional;

import ar.edu.unju.fi.ejercicio06.model.FelinoSalvaje;

@FunctionalInterface
public interface Converter <T,T1> {
	T1 convert(T t);
	
	static <T> boolean isNotNull(T t) {
		return t !=null;
	}
	default void mostrarObjetos(T t) {
		System.out.println("objeto "+ t.toString());
	}
	
}