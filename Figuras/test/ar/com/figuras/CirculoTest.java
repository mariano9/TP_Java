package ar.com.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void CirculoPerimetroTest() 
	{
		Circulo miCirculo = new Circulo(5.0);
		Double valor_esperado = 31.4159;
		Double valor_obtenido = miCirculo.calcularCirculoPerimetro();
		assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.01);
	}
	
	
	
	@Test
	public void CirculoAreaTest() 
	{
		Circulo miCirculo = new Circulo(5.0);
		Double valor_esperado = 78.5398;
		Double valor_obtenido = miCirculo.calcularCirculoArea();
		assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.01);
	}
}
