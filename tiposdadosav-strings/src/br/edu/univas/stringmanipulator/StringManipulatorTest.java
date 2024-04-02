package br.edu.univas.stringmanipulator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulatorTest {
	
	@Test
    public void calcularNumeroVogaisConsoantes1() {
		StringManipulator stringManipulator = new StringManipulator();
		
		int vogais = stringManipulator.getNumeroVogais("O sol brilha hoje.");
		int consoantes = stringManipulator.getNumeroConsoantes("O sol brilha hoje.");
		
        assertEquals(6, vogais);
        assertEquals(8, consoantes);
    }
	
	@Test
    public void calcularNumeroVogaisConsoantes2() {
		StringManipulator stringManipulator = new StringManipulator();
		
		int vogais = stringManipulator.getNumeroVogais("As montanhas erguem-se majestosas sob o ceu estrelado.");
		int consoantes = stringManipulator.getNumeroConsoantes("As montanhas erguem-se majestosas sob o ceu estrelado.");
		
        assertEquals(20, vogais);
        assertEquals(25, consoantes);
    }
	
	@Test
    public void calcularNumeroVogaisConsoantes3() {
		StringManipulator stringManipulator = new StringManipulator();
		
		int vogais = stringManipulator.getNumeroVogais("A noite tranquila embala os sonhos da humanidade adormecida.");
		int consoantes = stringManipulator.getNumeroConsoantes("A noite tranquila embala os sonhos da humanidade adormecida.");
		
        assertEquals(25, vogais);
        assertEquals(26, consoantes);
    }
	
	@Test
    public void verificarIsAnagrama1() {
		StringManipulator stringManipulator = new StringManipulator();
		
		boolean isAnagrama = stringManipulator.getIsAnagrama("conta", "canto");
		
        assertTrue(isAnagrama);
    }
	
	@Test
    public void verificarIsAnagrama2() {
		StringManipulator stringManipulator = new StringManipulator();
		
		boolean isAnagrama = stringManipulator.getIsAnagrama("arroz", "zorra");
		
        assertTrue(isAnagrama);
    }
	
	@Test
    public void verificarIsAnagrama3() {
		StringManipulator stringManipulator = new StringManipulator();
		
		boolean isAnagrama = stringManipulator.getIsAnagrama("julia", "julio");
		
        assertFalse(isAnagrama);
    }

}
