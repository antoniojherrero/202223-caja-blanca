import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.*;
import com.cajanegra.*;

public class testExistePalabra {
	Editor editor = new Editor();
	
	@Test
	public void testCamino1() {
		editor.cargarEditor("./editorTamaño0");
		assertEquals(false,editor.existePalabra("prueba"));
	}
	@Test
	public void testCamino3() {
		editor.cargarEditor("./editorTamaño1");
		assertEquals(false, editor.existePalabra("prueba"));
	}
	@Test
	public void testCamino4() {
		editor.cargarEditor("./editor1Palabra");
		assertEquals(false, editor.existePalabra("prueba"));
	}
	@Test
	public void testCamino5() {
		editor.cargarEditor("./editor1Palabra");
		assertEquals(true, editor.existePalabra("hola"));
	}
}
