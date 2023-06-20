import com.cajablanca.editor.Editor;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;
import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class testNumApariciones {
	Editor editor = new Editor();
	
	@Test
	public void testCamino1() {
		editor.cargarEditor("./pom.xml");
		assertThrows(IllegalArgumentException.class, ()->{
			editor.numApariciones(-1, 0, "prueba");
		});
	}
	
	@Test
	public void testCamino2() {
		editor.cargarEditor("./pom.xml");
		assertThrows(IllegalArgumentException.class, ()->{
			editor.numApariciones(1, editor.size()+1, "prueba");
		});
	}
	@Test
	public void testCamino3() {
		editor.cargarEditor("./editorTamaño0");
		assertEquals(0,editor.numApariciones(1, -1, "prueba"));
	}
	@Test
	public void testCamino4() {
		editor.cargarEditor("./pom.xml");
		assertEquals(0, editor.numApariciones(2, 1, "prueba"));
	}
	
	@Test
	public void testCamino5() {
		editor.cargarEditor("./editorTamaño1");
		assertEquals(0, editor.numApariciones(1, 1, "hola"));
	}
	@Test
	public void testCamino6(){
		editor.cargarEditor("./editor1Palabra");
		assertEquals(0, editor.numApariciones(1, 1, "prueba"));
	}
	@Test
	public void testCamino7() {
		editor.cargarEditor("./editor1Palabra");
		assertEquals(1,editor.numApariciones(1, 1, "hola"));
	}
}
