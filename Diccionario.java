import java.util.List;
/**
 * @author: Sharis Barrios
 * Creación de clase diccionario que cuenta con los diccionarios inglés, español y  francés
 */

public class Diccionario {
    private BinarySearchTree<String, List<String>> ingles;
    private BinarySearchTree<String, List<String>> espanol;
    private BinarySearchTree<String, List<String>> frances;

    // Constructor
    public Diccionario() {
        this.ingles = new BinarySearchTree<String, List<String>>();
        this.espanol = new BinarySearchTree<String, List<String>>();
        this.frances = new BinarySearchTree<String, List<String>>();
    }


    
    /** 
     * @return BinarySearchTree<String, List<String>>
     */
    public BinarySearchTree<String,List<String>> getIngles() {
        return this.ingles;
    }
    
    
    /** 
     * @param ingles
     */
    public void setIngles(BinarySearchTree<String,List<String>> ingles) {
        this.ingles = ingles;
    }

    
    /** 
     * @return BinarySearchTree<String, List<String>>
     */
    public BinarySearchTree<String,List<String>> getEspanol() {
        return this.espanol;
    }

    
    /** 
     * @param espanol
     */
    public void setEspanol(BinarySearchTree<String,List<String>> espanol) {
        this.espanol = espanol;
    }

    
    /** 
     * @return BinarySearchTree<String, List<String>>
     */
    public BinarySearchTree<String,List<String>> getFrances() {
        return this.frances;
    }

    
    /** 
     * @param frances
     */
    public void setFrances(BinarySearchTree<String,List<String>> frances) {
        this.frances = frances;
    }

    
    /** 
     * @param idioma
     * @param palabra
     * @return String
     */
    // Método para devolver la traducción de una palabra a los otros dos idiomas
    public String Idioma(int idioma, String palabra){
        if (idioma == 1){
           return ingles.despliegueDeBusqueda(ingles.search(palabra));
        }
        if (idioma == 2){
           return espanol.despliegueDeBusqueda(espanol.search(palabra));
        }
        if (idioma == 3){
           return frances.despliegueDeBusqueda(frances.search(palabra));
        }

        return null;
    }


    
    /** 
     * @param tipo
     * @return BinarySearchTree<String, List<String>>
     */
    public BinarySearchTree<String,List<String>> tipoArbol(int tipo){
        if (tipo == 1){
            return ingles;
         }
         if (tipo == 2){
            return espanol;
         }
         if (tipo == 3){
            return frances;
         }
 
         return null;
    }

}
