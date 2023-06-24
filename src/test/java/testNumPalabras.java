import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import com.cajablanca.editor.*;
import com.cajanegra.*;

public class testNumPalabras {
	Editor editor = new Editor();
	
	@Test
	public void testCamino1() {
		editor.cargarEditor("./editorTamaño0");
		assertThrows(EmptyCollectionException.class,()->{
			editor.numPalabras();
		});
	}
	@Test
	public void testCamino4() throws EmptyCollectionException {
		editor.cargarEditor("./editorTamaño1");
		assertEquals(0,editor.numPalabras());
	}
	
	@Test
	public void testCamino6() throws EmptyCollectionException {
		editor.cargarEditor("./editor1Palabra");
		assertEquals(1,editor.numPalabras());
	}
}
