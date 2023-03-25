import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Sharis Barrios 
 * Clase de lectura para almacenar diccionario en arboles binarios
 */

public class LeerArchivo {

    
    /** 
     * @param nombreArchivo
     * @param indicador
     * @return BinarySearchTree<String, List<String>>
     */
    // Método para leer y crear arboles binarios
    public static BinarySearchTree<String, List<String>> leerArchivo(String nombreArchivo, int indicador) {
        BinarySearchTree<String, List<String>> arbol = new BinarySearchTree<String, List<String>>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
            String linea;

            while ((linea = br.readLine()) != null) {
                if (indicador == 0){ // Para crear un diccionario en ingles
                    String[] datos = linea.split(",");
                    String llave = datos[indicador].trim();
                    String valor = datos[1].trim();
                    String valor1 = datos[2].trim();
                    List<String> valores = new ArrayList<>();
                    valores.add(valor);
                    valores.add(valor1);
                    arbol.insert(llave, valores);
                } 
                if (indicador== 1) { // Para crear un diccionario en español
                    String[] datos = linea.split(",");
                    String llave = datos[indicador].trim();
                    String valor = datos[0].trim();
                    String valor1 = datos[2].trim();
                    List<String> valores = new ArrayList<>();
                    valores.add(valor);
                    valores.add(valor1);
                    arbol.insert(llave, valores);
                }
                if (indicador== 2) { // Para crear un diccionario en francés
                    String[] datos = linea.split(",");
                    String llave = datos[indicador].trim();
                    String valor = datos[0].trim();
                    String valor1 = datos[1].trim();
                    List<String> valores = new ArrayList<>();
                    valores.add(valor);
                    valores.add(valor1);
                    arbol.insert(llave, valores);                
                }
                
            }

            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return arbol;
    }

    
    /** 
     * @param filename
     * @return List<List<String>>
     * @throws IOException
     */
    // Método para leer y guardar líneas a traducir 
    public static List<List<String>> leerLineas(String filename) throws IOException {
        List<List<String>> lines = new ArrayList<>();
    
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] wordsInLine = line.split(" ");
            List<String> words = new ArrayList<>();
            for (String word : wordsInLine) {
                words.add(word);
            }
            lines.add(words);
        }
        reader.close();
    
        return lines;
    }

    
    /** 
     * @param archivo
     */
    // Método para imprimir las líneas de un archivo 
    public static void imprimirLineas(String archivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
          String linea;
          int contador = 1;
          while ((linea = br.readLine()) != null) {
            System.out.println(contador + ": " + linea);
            contador++;
          }
        } catch (IOException e) {
          System.err.println("Error al leer el archivo: " + e.getMessage());
        }
      }
    
}
