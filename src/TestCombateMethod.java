import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Motor.CombateMethod;

class TestCombateMethod {

	@Test
	void test() {
		CombateMethod c1 = new CombateMethod(0,Clases.Salas.COMBATE, "NADA");
		c1.getEnemigos();
		assertFalse(c1.getEnemigos().isEmpty());
	}

}
