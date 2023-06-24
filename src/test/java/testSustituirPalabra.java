import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.EmptyCollectionException;

public class testSustituirPalabra {
	Editor editor = new Editor();
	
	@Test
	public void testCamino1() {
		editor.cargarEditor("./editorTamaño0");
		Editor actual = editor;
		editor.sustituirPalabra("hola", "buenas");
		assertEquals(actual, editor);
	}
	@Test
	public void testCamino2() {
		editor.cargarEditor("./editorTamaño1");
		Editor expected = editor;
		editor.sustituirPalabra("hola", "buenas");
		assertEquals(expected, editor);
	}
	@Test
	public void testCamino3() {
		editor.cargarEditor("./editorTamaño2");
		Editor expected = editor;
		editor.sustituirPalabra("hola", "buenas");
		assertEquals(expected, editor);
	}
	@Test
	public void testCamino4() {
		editor.cargarEditor("./editor1Palabra");
		Editor expected = editor;
		editor.sustituirPalabra("prueba", "hola");
		assertEquals(expected, editor);
	}
	@Test
	public void testCamino5() throws EmptyCollectionException {
		editor.cargarEditor("./editor1Palabra");
		editor.sustituirPalabra("hola", "buenas");
		assertEquals("buenas",editor.getLinea(1).getAtPos(1));
	}
}
