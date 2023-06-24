import com.cajablanca.grafo.Arco;
import com.cajablanca.grafo.Grafo;

public class Main {

	public static void main(String[] args) {
		Grafo grafoDosNodos = new Grafo();
		grafoDosNodos.addVertice(1);
		grafoDosNodos.addVertice(2);
		grafoDosNodos.addArco(new Arco(1,2,1));
		
		grafoDosNodos.printListaAdyacentes(1);
		
	}

}
