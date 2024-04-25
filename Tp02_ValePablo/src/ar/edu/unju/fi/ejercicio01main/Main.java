package ar.edu.unju.fi.ejercicio01main;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		List<Producto> productos=new ArrayList<>();
		// TODO Auto-generated method stub
		Producto prod01= new Producto("01", "dulce", 345, OrigenFabricacion.ARGENTINA, Categoria.INFORMATICA);
		Producto prod02=new Producto();
		prod02.setCodigo("02");
		prod02.setDescripcion("dulce2");
		prod02.setPrecioUnitario(3456);
		prod02.setOrigen(OrigenFabricacion.BRASIL);
		prod02.setCategoria(Categoria.HERRAMIENTAS);
		Producto prod03=new Producto();
		prod03.setCodigo("02");
		prod03.setDescripcion("dulce32");
		prod03.setPrecioUnitario(3456);
		prod03.setOrigen(OrigenFabricacion.BRASIL);
		prod03.setCategoria(Categoria.HERRAMIENTAS);
		
		
		productos.add(prod01);
		productos.add(prod02);
		
		System.out.println(productos);
		
	}

}
