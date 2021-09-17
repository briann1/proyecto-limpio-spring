package tdd;

import java.math.BigDecimal;

public class CajaFuerte {

	private Boolean abierta=true;
	public boolean estaAbierta() {
		// TODO Auto-generated method stub
		return abierta;
	}
	public boolean estaCerrada() {
		return !abierta;
	}
	public void cerrar(int codigoDeApertura) {
		abierta=false; 
	}
	public void abrir(int codigoApertura) {
		abierta=true;
	}

}
