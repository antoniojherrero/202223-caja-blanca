package testGrafo;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;

public class testComponentsRelated {
	Grafo grafo = new Grafo();
	Grafo grafoDosNodos = new Grafo();
	Grafo grafoUnNodoReflexivo = new Grafo();
	
	@Test
	public void testCamino1() {
		assertEquals("",grafo.componentsRelated());
	}
	@Test
	public void testCamino4() {
		grafo.addVertice(1);
		assertEquals("[1]",grafo.componentsRelated());
	}
	@Test
	public void testCamino5() {
		
        grafoUnNodoReflexivo.addVertice(1);
        grafoUnNodoReflexivo.addArco(new Arco(1, 1, 1));
        assertEquals("[1]",grafoUnNodoReflexivo.componentsRelated());
	}
	@Test
	public void testCamino6() {
		
        grafoDosNodos.addVertice(1);
        grafoDosNodos.addVertice(2);
        grafoDosNodos.addArco(new Arco(1, 2, 1));
        assertEquals("[1 2]", grafoDosNodos.componentsRelated());
	}
}
