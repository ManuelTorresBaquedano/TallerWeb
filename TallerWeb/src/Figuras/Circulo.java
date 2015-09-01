package Figuras;

public class Circulo {

	private double pi = 3.14;
	private double r = 12;
	private double perimetro;
	private double area;
	

	

	public double ObtenerPerimetro(){
			perimetro = 2 * pi * r ;
			return perimetro;
		
				
									}
	
	public double ObtenerArea(){
		
		area = perimetro * r;
		return area;
	}
	  
		
	}
			
			

