package testGrafo;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Grafo;

public class testTodosVisitados {
	Grafo grafo = new Grafo();
	@Test
	public void testCamino1() {
		assertEquals(true,grafo.todosVisitados());
	}
	@Test
	public void testCamino2() {
		grafo.addVertice(1);
		assertTrue(grafo.todosVisitados());
	}
	@Test
	public void testCamino3() {
		grafo.addVertice(1);
		assertFalse(grafo.todosVisitados());
	}
}
