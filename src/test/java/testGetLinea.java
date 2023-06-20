import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import com.cajablanca.editor.Editor;
import com.cajanegra.AbstractSingleLinkedListImpl;
import com.cajanegra.EmptyCollectionException;
import com.cajanegra.SingleLinkedListImpl;

public class testGetLinea {
	Editor editor = new Editor();
	@Test
	public void testCamino1() {
		assertThrows(EmptyCollectionException.class, ()->{
			editor.getLinea(0);
		});
	}
	@Test
	public void testCamino2() {
		editor.cargarEditor("./pom.xml");
		assertThrows(IllegalArgumentException.class, ()->{
			editor.getLinea(-1);
		});
	}
	@Test
	public void testCamino3() {
		editor.cargarEditor("./pom.xml");
		assertThrows(IllegalArgumentException.class, ()->{
			editor.getLinea(editor.size()+1);
		});
	}
	@Test
	public void testCamino4() throws EmptyCollectionException {
		editor.cargarEditor("./pom.xml");
		AbstractSingleLinkedListImpl<String> list = new SingleLinkedListImpl<>();
        list.addFirst("project");
        list.addLast("xmlnshttpmavenapacheorgPOM400");
        assertEquals(list.toString(), editor.getLinea(1).toString());
	}
	
}
