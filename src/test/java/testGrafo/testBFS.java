package testGrafo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;

public class testBFS {
	Grafo grafo = new Grafo();
	
	@Test
	public void testCamino1() {
		assertThrows(Exception.class,()->{
			grafo.BFS(1);
		});
	}
	@Test
	public void testCamino3() {
		grafo.addVertice(1);
		assertEquals("[1]",grafo.BFS(1));
	}
	@Test
	public void testCamino4() {
		grafo.addVertice(1);
		grafo.addArco(new Arco(1,1,1));
		
		assertEquals("[1]",grafo.BFS(1));
	}
	@Test
	public void testCamino5() {
		grafo.addVertice(1);
		grafo.addVertice(2);
		grafo.addArco(new Arco(1,2,1));
		
		assertEquals("[1 2]",grafo.BFS(1));
	}
}
