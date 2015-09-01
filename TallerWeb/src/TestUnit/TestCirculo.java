package TestUnit;

import org.junit.Assert;
import org.junit.Test;
import Figuras.Circulo;

public class TestCirculo {

	@Test
	public void ObtenerPerimetro() {
		
		Circulo c = new Circulo();
		
		double perimetro = c.ObtenerPerimetro();
		double area = c.ObtenerArea();
		
		Assert.assertTrue(perimetro > 0);
		Assert.assertTrue(area > 0);
	}

}
