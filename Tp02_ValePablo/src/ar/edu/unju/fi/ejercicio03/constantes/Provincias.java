package ar.edu.unju.fi.ejercicio03.constantes;

public enum Provincias {
	JUJUY(673973,37623),
	SALTA (1424397,155340), 
	TUCUMAN(1694656,22592), 
	CATAMARCA (415438,101486),
	LA_RIOJA(393531,91493), 
	SANTIAGO_DEL_ESTERO(978313,	136934);
	
	private int cantidadPoblacion;
	private int superficie;
	private Provincias(int cantidadPoblacion, int superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}
	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}
	public void setCantidadPoblacion(int cantidadPoblacion) {
		this.cantidadPoblacion = cantidadPoblacion;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public double calcularDensidad (int poblacion, int superficie) {
		
		return poblacion/superficie;
	}
	
}
