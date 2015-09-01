package Figuras;

public class Main {

	public static void main(String[] args) {
		
		Circulo c = new Circulo();
		Cuadrado cuadrado = new Cuadrado();
		
				System.out.println("El perimetro es: " + c.ObtenerPerimetro());
				System.out.println("El area es: " + c.ObtenerArea());

				System.out.println("El area del cuadrado es: "+ cuadrado.ObtenerArea());
				System.out.println("El perimetro del cuadrado es: "+ cuadrado.ObtenerPerimtero());
				
				
	}

}
