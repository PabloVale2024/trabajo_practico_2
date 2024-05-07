package ar.edu.unju.fi.ejercicio05.model;
import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio05.interfaces.Pago;

public class PagoEfectivo implements Pago {
		private LocalDate fechaPago;
		private double montoPagado;
		
		
		
		public LocalDate getFechaPago() {
			return fechaPago;
		}

		public void setFechaPago(LocalDate fechaPago) {
			this.fechaPago = fechaPago;
		}

		public double getMontoPagado() {
			return montoPagado;
		}

		public void setMontoPagado(double montoPagado) {
			this.montoPagado = montoPagado;
		}

		public PagoEfectivo(LocalDate fechaPago, double montoPagado) {
			super();
			this.fechaPago = fechaPago;
			this.montoPagado = montoPagado;
		}

		public PagoEfectivo() {
			super();
			// TODO Auto-generated constructor stub
		}

		public void realizarPago (double monto) {
			montoPagado=monto-(montoPagado *0.15);
			
		}
		
		@Override
		public void imprimirRecibo() {
			System.out.println("Pago Realizado");
			System.out.println("Fecha de Pago: "+fechaPago);
			System.out.println("Monto Pagado: "+ montoPagado);
			// TODO Auto-generated method stub
			
		}
}
