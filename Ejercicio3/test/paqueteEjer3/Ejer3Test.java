package paqueteEjer3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejer3Test {
	

		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
		@CsvSource({"1, lunes",
					"2, martes",
					"3, miercoles",
					"4, jueves",
					"5, viernes",
					"6, sabado",
					"7, domingo",
					"0, ERROR!",
					"14, ERROR!"})
		
		void testdiaSemana(int input, String expected) {
			Ejer3 c = new Ejer3();
			assertEquals(expected, c.diaSemana(input));
			
		}

	

}
