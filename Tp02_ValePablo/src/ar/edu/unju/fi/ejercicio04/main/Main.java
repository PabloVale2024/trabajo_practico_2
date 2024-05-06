package ar.edu.unju.fi.ejercicio04.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio04.constantes.Posicion;
import ar.edu.unju.fi.ejercicio04.model.Jugador;

public class Main {

	public static void main(String[] args) {
		 Scanner escaneo=new Scanner(System.in);
		 //Calendar fechaIngresada=  Calendar.getInstance();
	      ArrayList<Jugador> jugadores = new ArrayList<>();
	        int opcion;
	        String nombre;
   		String apellido;
   		String nacionalidad;
   		int indice;
		        do {
		            System.out.println("Menú de opciones:");
		            System.out.println("1 – Alta de jugador");
		            System.out.println("2 – Mostrar todos los jugadores");
		            
		            System.out.println("3 – Modificar Pocision de un jugador");
		            System.out.println("4 – Eliminar un jugador");
		            System.out.println("5 – Salir");
		            System.out.print("Ingrese una opción: ");
		            opcion = escaneo.nextInt();
		            escaneo.nextLine(); 
		            try {
		            switch (opcion) {
		                case 1:
		                	
		                	Calendar fechaIngresada=  Calendar.getInstance();
		                	System.out.println("Carga de nuevo Jugador");
		                	System.out.println("ingrese Nombre");
		                	String nombre1= escaneo.nextLine();
		                	System.out.println("ingrese apellido");
		                	String apellido1=escaneo.next();
		                	try {
		                	System.out.println("ingrese fecha de Nacimiento");
		                	int dia;
		            		int mes;
		            		int anio;
		            		System.out.println("ingrese Dia de Nacimiento");
		            		dia = escaneo.nextInt();
		            		System.out.println("ingrese mes de  Nacimiento");
		            		mes = escaneo.nextInt()-1;
		            		System.out.println("Ingrese año de Nacimiento");
		            		anio=escaneo.nextInt();
		            		
		            		fechaIngresada.set(anio, mes, dia);
		            		//System.out.println(fechaIngresada);
		                	}catch (Exception e) {
		                		System.out.println("se introducido un dato incorrecto");
		                		e.printStackTrace();
		                	}
		                	System.out.println("Ingrese nacionalidad");
		                nacionalidad=escaneo.next();
		                System.out.println("Ingrese Estatura");
		                double estatura=escaneo.nextDouble();
		                System.out.println("Ingrese peso");
		                double peso=escaneo.nextDouble();
		                System.out.println("Eliga en que posicion Juega");
		                System.out.println("1.- DELANTERO");
		                System.out.println("2.- MEDIO");
		                System.out.println("3.- DEFENSA");
		                System.out.println("4.- ARQUERO");
		                int posicion=escaneo.nextInt();
		                Posicion posicionSeleccionanda = null;
		                if (1==posicion) {
		                	posicionSeleccionanda=Posicion.DELANTERO;
						}else if (2==posicion){
							posicionSeleccionanda=Posicion.MEDIO;
		                }else if (3==posicion){
							posicionSeleccionanda=Posicion.DEFENSA;
		                }else if (4==posicion){
							posicionSeleccionanda=Posicion.ARQUERO;
		                }
		                Jugador jugador1 = new Jugador(nombre1, apellido1, fechaIngresada, nacionalidad, estatura, peso, posicionSeleccionanda);
		                jugadores.add(jugador1);    
		                break;
		                case 2:
		            		System.out.println("Mostrando Jugadores");
		            		
		            		for (Jugador jug : jugadores) {
		            			
		            		         System.out.println(jug);     
		            		}
		                    break;
		              
		                case 3:
		                	int posicion3;
		                	System.out.println("Modificar Posicion de Jugadorr");
		                	System.out.println("ingrese Nombre");
		            		nombre = escaneo.next();
		            		System.out.println("ingrese Apellido");
		            		apellido = escaneo.next();
		            		for (Jugador jug : jugadores) {
		            			if (jug.getNombre().contains(nombre) && jug.getApellido().contains(apellido)) {
		            				//indice = jugadores.indexOf(jug);
		            				System.out.println("Ingrese la posicion del jugador");
		            				System.out.println("1.- DELANTERO");
		    		                System.out.println("2.- MEDIO");
		    		                System.out.println("3.- DEFENSA");
		    		                System.out.println("4.- ARQUERO");
		    		                posicion3 = escaneo.nextInt();
		    		                Posicion posicionSeleccionada=null;
		    		                if (1==posicion3) {
		    		                	posicionSeleccionada=Posicion.DELANTERO;
		    						}else if (2==posicion3){
		    							posicionSeleccionada=Posicion.MEDIO;
		    		                }else if (3==posicion3){
		    							posicionSeleccionada=Posicion.DEFENSA;
		    		                }else if (4==posicion3){
		    							posicionSeleccionada=Posicion.ARQUERO;
		    		                }
				            		jug.setPosicion(posicionSeleccionada);
				            		
		            		     }
		            		}
		                    break;
		                case 4:
		                	System.out.println("Elminar Jugador");
		                	System.out.println("ingrese Nombre");
		            		nombre = escaneo.next();
		            		System.out.println("ingrese su Apellido");
		            		apellido = escaneo.next();
		            		Iterator<Jugador> elimina=jugadores.iterator();
		            		
		            		while (elimina.hasNext()) {
		            			//int indice1 = elimina.hashCode();
		            			String apellidoAeliminar=elimina.next().getApellido();
		            			System.out.println(apellidoAeliminar);
		            			
		            			if (apellidoAeliminar.contentEquals(apellido)) { 
		            				elimina.remove();
		            				//jugadores.remove(elimina.hashCode());
		            		     }
		            		}
		                    break;
		                case 5:
		                	System.out.println("saliendo del Programa");
		                	break;
		                    }
		        
			        } finally {
			            System.out.println("Fin del programa.");
			        }
		        } while (opcion != 5);
	        escaneo.close();
	    
	}

}
