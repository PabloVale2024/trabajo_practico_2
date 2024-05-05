package ar.edu.unju.fi.ejercicio02.main;

//import java.sql.Date;
//import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio02.constantes.Mes;
import ar.edu.unju.fi.ejercicio02.model.Efemeride;
import ar.edu.unju.fi.ejercicio2.util.Listado;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Efemeride efe1= new Efemeride();
		Efemeride efe4= new Efemeride();
		efe1.setCodigo("01");
		efe1.setMes(Mes.ABRIL);
		efe1.setDia(19);
		efe1.setDetalle("fundacionde Jujuy");
		Listado.listadoEfemerides.add(efe1);
		efe4.setCodigo("02");
		efe4.setMes(Mes.AGOSTO);
		efe4.setDia(17);
		efe4.setDetalle("Jose de san martin");
		Listado.listadoEfemerides.add(efe4);
		Scanner escaneo=new Scanner(System.in);
		int opcion;
        
		
		 do {
	            System.out.println("Menú de opciones:");
	            System.out.println("1 – Crear Efemeride");
	            System.out.println("2 – Mostrar Efemerides");
	            System.out.println("3 – Eliminar Efemeride");
	            System.out.println("4 – Modificar Efemeride");
	            System.out.println("5 – Salir");
	            System.out.print("Ingrese una opción: ");
	            opcion = escaneo.nextInt();
	            escaneo.nextLine(); 
	            try {
	            switch (opcion) {
	                case 1:
	                	Efemeride efe2=new Efemeride();
	                	String codigo;
	            		int unMes;
	            		int unDia;
	            		int unAnio;
	            		String detalle;
	            		System.out.println("Ingrese Detalle");
	            		detalle=escaneo.nextLine();
	            		System.out.println("ingrese un codigo:");
	            		codigo=escaneo.next(); 
	            		System.out.println("ingrese Numero de Mes:");
	            		unMes=escaneo.nextInt();
	            		System.out.println("Ingrese dia");
	            		unDia=escaneo.nextInt();
	            		unAnio= 2024;
	            		
	            		Calendar calendario=new GregorianCalendar();
	            		calendario.set(unAnio, unMes, unDia);
	            		
	            		efe2.setCodigo(codigo);
	            		efe2.setDia(unDia);
	            		efe2.setDetalle(detalle);
	            		int mes=unMes;
	            		if (mes==1) {
	            			efe2.setMes(Mes.ENERO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==2) {
	            			efe2.setMes(Mes.FEBRERO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==3) {
	            			efe2.setMes(Mes.MARZO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==4) {
	            			efe2.setMes(Mes.ABRIL);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==5) {
	            			efe2.setMes(Mes.MAYO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==6) {
	            			efe2.setMes(Mes.JUNIO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==7) {
	            			efe2.setMes(Mes.JULIO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==8) {
	            			efe2.setMes(Mes.AGOSTO);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==9) {
	            			efe2.setMes(Mes.SEPTIEMBRE);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==10) {
	            			efe2.setMes(Mes.OCTUBRE);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==11) {
	            			efe2.setMes(Mes.NOVIEMBRE);
	            			Listado.listadoEfemerides.add(efe2);
	            		}else if(mes ==12) {
	            			efe2.setMes(Mes.DICIEMBRE);
	            			Listado.listadoEfemerides.add(efe2);
	            		}
	            		break;
	                case 2:
	                	System.out.println("Mostrando efemerides");
	                	for (Efemeride i:Listado.listadoEfemerides) {
	                		System.out.println(i.toString());
	                	}
	            	break;	
	                case 3:
	                	System.out.println("Eliminar efemerides");
	                	for (Efemeride i:Listado.listadoEfemerides) {
	                		System.out.println(i);
	                	}
	                	System.out.println("ingrese codigo de efemeride a eliminar");
	                	String codigo1=escaneo.next();
	                	//int posicion=0;
	                	for (Efemeride i:Listado.listadoEfemerides) {
	                		if(i.getCodigo().contains(codigo1)) {
	                			
	                			Listado.listadoEfemerides.remove(Listado.listadoEfemerides.indexOf(i));
	                		}//else {
	                			//posicion=+1;
	                		//}
	                	}
	                	System.out.println("Eliminando");
	                	for (Efemeride j:Listado.listadoEfemerides) {
		                		System.out.println(j);	
	                	}
	                break;
	                case 4:
	                	System.out.println("Modificar efemerides");
	                	for (Efemeride i:Listado.listadoEfemerides) {
	                		System.out.println(i);
	                	}
	                	System.out.println("ingrese codigo de efemeride");
	                	String codigo2=escaneo.nextLine();
	                	for (Efemeride i:Listado.listadoEfemerides) {
	                		if(i.getCodigo().contentEquals(codigo2)) {
	                			System.out.println("Ingrese Detalle");
	    	            		detalle=escaneo.nextLine();	
	    	  
	                			System.out.println("ingrese Numero de Mes:");
	    	            		unMes=escaneo.nextInt();
	    	            		System.out.println("Ingrese dia");
	    	            		unDia=escaneo.nextInt();
	    	            		unAnio= 2024;
	    	            		Calendar calendario1=new GregorianCalendar();
	    	            		calendario1.set(unAnio, unMes-1, unDia);
	    	            		
	    	            		i.setCodigo(codigo2);
	    	            		i.setDia(unDia);
	    	            		i.setDetalle(detalle);
	    	            		int mes1=unMes;
	    	        	     if (mes1==1) {
	  	            			i.setMes(Mes.ENERO);
		            		}else if(mes1 ==2) {
		            			i.setMes(Mes.FEBRERO);
		            			
		            		}else if(mes1 ==3) {
		            			i.setMes(Mes.MARZO);
		            			
		            		}else if(mes1 ==4) {
		            			i.setMes(Mes.ABRIL);
		            			
		            		}else if(mes1 ==5) {
		            			i.setMes(Mes.MAYO);
		            			
		            		}else if(mes1 ==6) {
		            			i.setMes(Mes.JUNIO);
		            			
		            		}else if(mes1 ==7) {
		            			i.setMes(Mes.JULIO);
		            			
		            		}else if(mes1 ==8) {
		            			i.setMes(Mes.AGOSTO);
		            			
		            		}else if(mes1 ==9) {
		            			i.setMes(Mes.SEPTIEMBRE);
		            			
		            		}else if(mes1 ==10) {
		            			i.setMes(Mes.OCTUBRE);
		            			
		            		}else if(mes1 ==11) {
		            			i.setMes(Mes.NOVIEMBRE);
		            			
		            		}else if(mes1 ==12) {
		            			i.setMes(Mes.DICIEMBRE);
		            			
		            		}
	                			
	                		}
	                	}
	                	break;
	                case 5: System.out.println("Fin  programa");
	            break;
	            }
	            
	            } finally {
		            System.out.println("Fin del programa.");
		        }
	         
	            	
	            }while (opcion!=5);
	            
	            	
	 }
}