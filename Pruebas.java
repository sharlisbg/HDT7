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
	public void calculandoConExito() {

        BinarySearchTree<String, String> arbol = new BinarySearchTree<String, String>();
        arbol.insert("hola", null);
        arbol.insert("mundo", null);
        arbol.insert("gato", null);    
	}

    }