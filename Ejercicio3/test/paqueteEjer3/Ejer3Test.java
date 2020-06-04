package paqueteEjer3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Ejer3Test {
	

		@ParameterizedTest (name = "{index} => Con entrada ({0}) sale {1}")
		@CsvSource({"2, 1",
					"5, 1",
					"6, 1",
					"14, 7"})
		
		void testdiaSemana(int input, String expected) {
			Ejer3 c = new Ejer3();
			assertEquals(expected, c.diaSemana(input));
			
		}

	

}
