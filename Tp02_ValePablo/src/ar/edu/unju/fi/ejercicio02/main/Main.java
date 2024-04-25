package ar.edu.unju.fi.ejercicio02.main;

import ar.edu.unju.fi.ejercicio02.constantes.Mes;
import ar.edu.unju.fi.ejercicio02.model.Efemeride;
import ar.edu.unju.fi.ejercicio2.util.Listado;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Efemeride efe1= new Efemeride();
		
		efe1.setCodigo("01");
		efe1.setMes(Mes.ABRIL);
		efe1.setDia(19);
		efe1.setDetalle("fundacionde Jujuy");
		Listado.listadoEfemerides.add(efe1);

}
}