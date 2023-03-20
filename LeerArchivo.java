import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerArchivo {
    public static BinarySearchTree<String, List<String>> leerArchivo(String nombreArchivo, int indicador) {
        BinarySearchTree<String, List<String>> arbol = new BinarySearchTree<String, List<String>>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String llave = datos[indicador].trim();
                String valor = datos[1].trim();
                String valor1 = datos[2].trim();

                List<String> valores = new ArrayList<>();
                valores.add(valor);
                valores.add(valor1);
                arbol.insert(llave, valores);
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arbol;
    }
}
