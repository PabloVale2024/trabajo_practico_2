package ar.edu.unju.fi.ejercicio04.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import ar.edu.unju.fi.ejercicio04.constantes.Posicion;

public class Jugador {
	private String nombre;
	private String apellido;
	Calendar fechaNacimiento;
	private String nacionalidad;
	private double estatura;
	private double peso;
	private Posicion posicion;
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jugador(String nombre, String apellido, Calendar fechaNacimiento, String nacionalidad, double estatura,
			double peso, Posicion posicion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
		this.estatura = estatura;
		this.peso = peso;
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public Posicion getPosicion() {
		return posicion;
	}
	public void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	
	public int calcularEdad(Calendar fechaNacimiento) {
		Calendar hoy= Calendar.getInstance();
		int anioActual=hoy.get(Calendar.YEAR);
				int anioJugador=fechaNacimiento.get(Calendar.YEAR);
				int edad = anioActual-anioJugador;

		return edad;
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		String format=sdf.format(fechaNacimiento.getTime());
		return "\nJugador \nNombre y Apellido= " + nombre + " "+ apellido + " \nFecha de Nacimiento= " +
				format+" Edad: "+calcularEdad(fechaNacimiento)
				+ ", \nNacionalidad= " + nacionalidad + " \nEstatura= " + estatura + " Peso= " + peso + " Posicion= "
				+ posicion;
	}
	
}
