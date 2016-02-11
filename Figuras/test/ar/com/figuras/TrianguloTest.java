package ar.com.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TrianguloTest {

	
////////PERIMETROS//////////////
	
	@Test
	public void perimetroConTrianguloEquilatero()
	{
	Triangulo miTriangulo = new Triangulo(4.0, 4.0, 4.0);
	Double valor_esperado = 12.0;
	Double valor_obtenido = miTriangulo.calcularTrianguloPerimetro();
	assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.1);
	}
	
	@Test
	public void perimetroConTrianguloIsosceles() 
	{
	Triangulo miTriangulo = new Triangulo(8.0, 5.0, 8.0);
	Double valor_esperado = 21.0;
	Double valor_obtenido = miTriangulo.calcularTrianguloPerimetro();
	assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.1);
	}
	
	@Test
	public void perimetroConTrianguloEscaleno() 
	{
	Triangulo miTriangulo = new Triangulo(7.0, 4.0, 12.0);
	Double valor_esperado = 23.0;
	Double valor_obtenido = miTriangulo.calcularTrianguloPerimetro();
	assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.1);
	}
	
	
///////////AREAS//////////////
	
	@Test
	public void areaConTrianguloEquilatero()
	{
	Triangulo miTriangulo = new Triangulo(5.0, 5.0, 5.0);
	Double valor_esperado = 10.8253;
	Double valor_obtenido = miTriangulo.calcularTrianguloArea();
	assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.01);
	}
	
	@Test
	public void areaConTrianguloIsosceles()
	{
	Triangulo miTriangulo = new Triangulo(8.0, 4.0, 8.0);
	Double valor_esperado = 15.4919;
	Double valor_obtenido = miTriangulo.calcularTrianguloArea();
	assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.01);
	}
	
	@Test
	public void areaConTrianguloEscaleno()
	{
	Triangulo miTriangulo = new Triangulo(3.0, 5.0, 7.0);
	Double valor_esperado = 6.4951;
	Double valor_obtenido = miTriangulo.calcularTrianguloArea();
	assertEquals(valor_esperado.doubleValue(),valor_obtenido.doubleValue(),0.01);
	}
}
