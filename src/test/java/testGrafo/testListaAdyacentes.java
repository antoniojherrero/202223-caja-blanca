package testGrafo;
import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cajablanca.grafo.*;
public class testListaAdyacentes {
	Grafo grafo = new Grafo();
	Grafo grafoDosNodos = new Grafo();
	private static ByteArrayOutputStream outContent;
	private static final PrintStream originalOut = System.out;
	
	@AfterEach
	public void afterEach() {
		System.setOut(originalOut);
	}
	@BeforeEach
	public void setup() {
		outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		grafo.addVertice(1);
		
		grafoDosNodos.addVertice(1);
		grafoDosNodos.addVertice(2);
		grafoDosNodos.addArco(new Arco(1,2,1));
	}
	@Test
	public void testCamino1() {
		grafo.printListaAdyacentes(1);
		assertEquals("Adyacentes de 1: \r\n",outContent.toString());
	}
	@Test
	public void testCamino2() {
		grafoDosNodos.printListaAdyacentes(1);
		assertEquals("Adyacentes de 1: 2 \r\n",outContent.toString());
	}
}
