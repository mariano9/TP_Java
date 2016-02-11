package ar.com.figuras;

public class Circulo {
private Double radio;

		public Circulo(Double radio) 
		{	
		this.radio = radio;
		}
		
		public Double calcularCirculoPerimetro() {
		Double pi = 3.14159;
		return this.radio * 2 * pi;
		}
		
		public Double calcularCirculoArea() {
		Double pi = 3.14159;
		return this.radio * this.radio * pi;
		}
	
		
	
	
	
}
