package prima3;


import org.junit.Test;

public class Prima3Test {

	@Test
	public void testIsAptoParaReduccion() {
		Prima3.isAptoParaReduccion(30,5);
		Prima3.isAptoParaReduccion(27,3);
		Prima3.isAptoParaReduccion(24,1);
		Prima3.isAptoParaReduccion(28,5);
		Prima3.isAptoParaReduccion(25,3);
	}

	@Test
	public void testGetFactorEdad() {
		Prima3.getFactorEdad(17);
		Prima3.getFactorEdad(21);
		Prima3.getFactorEdad(30);
		Prima3.getFactorEdad(44);
		Prima3.getFactorEdad(60);
		Prima3.getFactorEdad(89);
		Prima3.getFactorEdad(92);
	}

	@Test
	public void testGetPuntosQuePuedePerder() {
		Prima3.getPuntosQuePuedePerder(17);
		Prima3.getPuntosQuePuedePerder(21);
		Prima3.getPuntosQuePuedePerder(30);
		Prima3.getPuntosQuePuedePerder(44);
		Prima3.getPuntosQuePuedePerder(60);
		Prima3.getPuntosQuePuedePerder(89);
		Prima3.getPuntosQuePuedePerder(92);
	}

	@Test
	public void testGetReduccion() {
		Prima3.getReduccion(17);
		Prima3.getReduccion(21);
		Prima3.getReduccion(30);
		Prima3.getReduccion(44);
		Prima3.getReduccion(60);
		Prima3.getReduccion(89);
		Prima3.getReduccion(92);
	}

	@Test
	public void testGetValorPrima() {
		Prima3.getValorPrima(500,2.8,1);
		Prima3.getValorPrima(500,1.8,2);
		Prima3.getValorPrima(500,1.0,4);
		Prima3.getValorPrima(500,0.8,7);
		Prima3.getValorPrima(500,1.5,4);
		Prima3.getValorPrima(500,1.8,3);
		Prima3.getValorPrima(500,0.8,7);
	}
	@Test
	public void testPrima() {
	Prima3 nuevo=new Prima3();
	}
	
}
