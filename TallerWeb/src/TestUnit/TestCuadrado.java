package TestUnit;

import org.junit.Assert;
import org.junit.Test;

import Figuras.Cuadrado;

public class TestCuadrado {

	@Test
	public void ObtenerArea() {
		
		Cuadrado cuadrado = new Cuadrado();
		
		/* cuadrado.lado1=4; */ // Se podria declarara a la variable aca.
		
		
		Assert.assertTrue(cuadrado.ObtenerPerimtero() == 256);
		
		
		
	}

}
