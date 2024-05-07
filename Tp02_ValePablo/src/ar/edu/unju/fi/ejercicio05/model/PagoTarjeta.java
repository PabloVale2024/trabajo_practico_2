package ar.edu.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoTarjeta implements Pago {	
	private String numeroTarjeta;
	private LocalDate fechaPago;
	private double montoPago;

	
	public PagoTarjeta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PagoTarjeta(String numeroTarjeta, LocalDate fechaPago, double montoPago) {
		super();
		this.numeroTarjeta = numeroTarjeta;
		this.fechaPago = fechaPago;
		this.montoPago = montoPago;
	}

	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}

	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public double getMontoPago() {
		return montoPago;
	}

	public void setMontoPago(double montoPago) {
		this.montoPago = montoPago;
	}

	@Override
	public void realizarPago(double monto) {
		montoPago=monto-(montoPago *0.15);
		

	}

	@Override
	public void imprimirRecibo() {
		System.out.println("Pago Realizado");
		System.out.println("Numero de Tarjeta: "+numeroTarjeta);
		System.out.println("Fecha de Pago: "+fechaPago);
		System.out.println("Monto Pagado: "+ montoPago);
		// TODO Auto-generated method stub

	}

}
