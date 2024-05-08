package ar.edu.unju.fi.ejercicio05.main;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;


import ar.edu.unju.fi.ejercicio01.model.Producto;
import ar.edu.unju.fi.ejercicio01.model.Producto.Categoria;
import ar.edu.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		List<Producto> productos=new ArrayList<>();
			Producto producto1= new Producto("01", "heladera", 890000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true);
			Producto producto2= new Producto("02", "cocina", 220000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true);
			Producto producto3= new Producto("03", "lavarropas", 1890000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true);
			Producto producto4= new Producto("04", "microondas", 390000, OrigenFabricacion.ARGENTINA, Categoria.ELECTROHOGAR, true);
			Producto producto5= new Producto("05", "horno", 190000, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR, true);
			Producto producto6= new Producto("06", "set destornillador", 90000, OrigenFabricacion.CHINA, Categoria.HERRAMIENTAS, false);
			Producto producto7= new Producto("07", "Notebook Sony", 2890000, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, true);
			Producto producto8= new Producto("08", "s10 ultra", 5890000, OrigenFabricacion.BRASIL, Categoria.TELOFONIA, false);
			Producto producto9= new Producto("09", "sony moteky", 2690000, OrigenFabricacion.URUGUAY, Categoria.ELECTROHOGAR, true);
			Producto producto10= new Producto("10", "Amoladora", 330000, OrigenFabricacion.CHINA, Categoria.HERRAMIENTAS, true);
			Producto producto11= new Producto("11", "hidrolavadora", 123000, OrigenFabricacion.CHINA, Categoria.HERRAMIENTAS, true);
			Producto producto12= new Producto("12", "NOkia 1100", 290000, OrigenFabricacion.CHINA, Categoria.TELOFONIA, false);
			Producto producto13= new Producto("13", "Sony lbt dr5", 2890000, OrigenFabricacion.BRASIL, Categoria.ELECTROHOGAR, true);
			Producto producto14= new Producto("14", "impresora 3d", 4890000, OrigenFabricacion.CHINA, Categoria.INFORMATICA, true);
			Producto producto15= new Producto("15", "canon ultra 8k", 7890000, OrigenFabricacion.URUGUAY, Categoria.INFORMATICA, true);
			productos.add(producto1);
			productos.add(producto2);
			productos.add(producto3);
			productos.add(producto4);
			productos.add(producto5);
			productos.add(producto6);
			productos.add(producto7);
			productos.add(producto8);
			productos.add(producto9);
			productos.add(producto10);
			productos.add(producto11);
			productos.add(producto12);
			productos.add(producto13);
			productos.add(producto14);
			productos.add(producto15);
			int opcion;
			Scanner escaneo= new Scanner(System.in);
			
			do {
	            System.out.println("Menú de opciones:");
	            System.out.println("1 – Mostrar Productos");
	            System.out.println("2 – Realizar Compra");
	            System.out.println("3 – Salir");
	            opcion=escaneo.nextInt();
	            try {
			switch (opcion){ 
			case 1:
				for(Producto prod:productos) {
					System.out.println(prod);
				}
				break;
			case 2:
				List<Producto> carrito =new ArrayList<Producto>();
				System.out.println("elija el codigo de producto a comprar");
				String codigo=escaneo.next();
				
				//Predicate<Producto> filtro = p -> {if (p.getCodigo().equals(codigo))
					//System.out.println(p);
				//};
				
				
				
						
			
			
				
				
				break;
			case 3:
				break;
			}
	            }catch (Exception e) {
	            	System.out.println("se a introducido un valor incorrecto");
	            }
					// TODO: handle exception
				}while (opcion !=3);
			escaneo.close();
	}
}
