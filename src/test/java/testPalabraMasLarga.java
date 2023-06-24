import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

public class testPalabraMasLarga {
	Editor editor = new Editor();
	
	@Test
	public void testCamino1() throws EmptyCollectionException {
		editor.cargarEditor("./editorTamaño0");
		assertNull(editor.palabraMasLarga());
	}
	@Test
	public void testCamino3() throws EmptyCollectionException {
		editor.cargarEditor("./editorTamaño1");
		assertNull(editor.palabraMasLarga());
	}
	@Test
	public void testCamino4() throws EmptyCollectionException {
		editor.cargarEditor("./editor2Palabras2");
		assertEquals("hola", editor.palabraMasLarga());
	}
	@Test
	public void testCamino5() throws EmptyCollectionException {
		editor.cargarEditor("./editor2Palabras");
		assertEquals("buenas", editor.palabraMasLarga());
	}
	@Test
	public void testCamino6() throws EmptyCollectionException {
		editor.cargarEditor("./editor1Palabra");
		assertEquals("hola",editor.palabraMasLarga());
	}
}
