package ar.com.figuras;

public class Triangulo {
private Double base;
private Double lado2;
private Double lado3;

		public Triangulo(Double base, Double lado2, Double lado3) 
			{
			this.base = base;
			this.lado2 = lado2;
			this.lado3 = lado3;
			}

		public Double calcularTrianguloPerimetro()
		{
		return this.base + this.lado2 + this.lado3;
		}
				
		public Double calcularTrianguloArea()
		{
				Double altura = Math.sqrt(this.lado2 * this.lado2 + (base / 2) * (base / 2));
				return base*altura / 2;
		}
		
}