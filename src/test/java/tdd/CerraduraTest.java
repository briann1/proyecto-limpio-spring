package tdd;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class CerraduraTest {
	public static final int CODIGO_DE_APERTURA=3434;
	private static final int CODIGO_INCORRECTO = 0;
	@Test
	public void cuandoSeCreaLaCajaFuerteDebeEstarAbierta(){
	// Preparación given(dado)
		
	// Ejecución when(cuando) que se quiere probar
	CajaFuerte caja=whenCreoUnaCajaFuerte();
	
	// Comprobación then(entonces) comprobar que cumple el paso 2 ejecucion
	thenLaCajaFuerteEstaAbierta(caja);
		
	}
	@Test
	public void testAlCerrarConCodigoLaCajaFuerteDebeEstarCerrada() {
		//Preparacion given
		CajaFuerte caja=givenCreoUnaCajaFuerte();
		//Ejecución when
		caja.cerrar(CODIGO_DE_APERTURA);
		//Comprobación then
		thenLaCajaFuerteEstaCerrada(caja);
	}
	@Test
	public void alIngresarElCodigoCorrectoLaCajaSeAbre() {
		CajaFuerte caja=givenCreoUnaCajaFuerte();
		caja.cerrar(CODIGO_DE_APERTURA);
		
		whenAbroLaCajaFuerteCon(CODIGO_DE_APERTURA,caja);
		
		thenLaCajaFuerteEstaAbierta(caja);
	}
	@Test
	public void alAbrirConCodigoErroneoTresVecesLaCerraduraSeBloquea() {
		CajaFuerte caja=givenCreoUnaCajaFuerte();
		caja.cerrar(CODIGO_DE_APERTURA);
		
		/*whenAbroLaCajaFuerteCon(CODIGO_INCORRECTO, caja, 3);
		
		thenLaCajaFuerteEstaCerrada(caja);
		thenLaCajaFuerteEstaBloqueada(caja),*/
	}
	

	private void whenAbroLaCajaFuerteCon(int codigoApertura, CajaFuerte caja) {
		caja.abrir(codigoApertura);
	}
	private CajaFuerte givenCreoUnaCajaFuerte() {
		return crearCaja();
	}
	private void thenLaCajaFuerteEstaCerrada(CajaFuerte caja) {
		assertThat(caja.estaCerrada()).isTrue();
	}
	
	
	
	
	
	
	private void thenLaCajaFuerteEstaAbierta(CajaFuerte caja) {
		
		assertThat(caja.estaAbierta()).isTrue();
	}

	private CajaFuerte whenCreoUnaCajaFuerte() {
		return crearCaja();
	}
	
	private CajaFuerte crearCaja(){
		return (new CajaFuerte());
	}
	
	
}

