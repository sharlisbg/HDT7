import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Test;

import java.lang.Exception;

/**
 * @author Sharis Barrios
 *
 */

public class Pruebas {

    @Test
    // Se hace una prueba para el funcionamiento de la inserción en el arbol binario
	public void PruebaDeInsertion() {
        BinarySearchTree<String, String> arbol = new BinarySearchTree<String, String>();
        arbol.insert("hola", null);
        arbol.insert("mundo", null);
        arbol.insert("gato", null);
        arbol.insert("perro", null);
        arbol.insert("piano", null);

	}


    @Test
    // Se hace una prueba para el funcionamiento de la búsqueda de una llave in-order
	public void PruebaDeBusqueda() {
        BinarySearchTree<String, String> arbol = new BinarySearchTree<String, String>();
        arbol.insert("hola", null);
        arbol.insert("mundo", null);
        arbol.insert("gato", null);
        arbol.insert("perro", null);
        arbol.insert("piano", null);
        arbol.search("perro");
        arbol.search("gato");

	}

}