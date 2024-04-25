package ar.edu.unju.fi.ejercicio03.constantes;

public enum Provincias {
	JUJUY(673973,37623); 
	//SALTA, 
	//TUCUMAN, 
	//CATAMARCA, 
	//LA_RIOJA, 
	//SANTIAGO_DEL_ESTERO;
	
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
	
}
