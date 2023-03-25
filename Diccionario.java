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

    /**
     * Método para traducir lineas del idioma específicado
     * @param words
     * @param idioma1
     * @param idioma2
     */
     public void TraduccionDeLineas(List<String> words, int idioma1, int idioma2 ) {
        for (String word : words) {
            if (idioma1 == 1){
                    // Comparamos cada palabra con la llave del árbol binario
                if (ingles.search(word) != null) {
                    // Si la palabra coincide con la llave, imprimimos el valor asociado
                    if (idioma2 == 2){ // Si se quiere una traducción al español
                        System.out.print(ingles.search(word).get(0) + " ");
                    }
                    if (idioma2 == 3){ // Si se quiere una traducción al francés
                        System.out.print(ingles.search(word).get(1) + " ");
                    }
                } else {
                    // De lo contrario, imprimimos la palabra encerrada en asteriscos
                    System.out.print("*" + word + "* ");
                }
            }


            if (idioma1 == 2){
                // Comparamos cada palabra con la llave del árbol binario
                if (espanol.search(word) != null) {
                    // Si la palabra coincide con la llave, imprimimos el valor asociado
                    if (idioma2 == 1){ // Si se quiere una traducción al ingles
                        System.out.print(espanol.search(word).get(0) + " ");
                    }
                    if (idioma2 == 3){ // Si se quiere una traducción al francés
                        System.out.print(espanol.search(word).get(1) + " ");
                    }
                } else {
                    // De lo contrario, imprimimos la palabra encerrada en asteriscos
                    System.out.print("*" + word + "* ");
                }
            }
            
            
            
            if (idioma1 == 3){
                // Comparamos cada palabra con la llave del árbol binario
                if (frances.search(word) != null) {
                    // Si la palabra coincide con la llave, imprimimos el valor asociado
                    if (idioma2 == 1){ // Si se quiere una traducción al ingles
                        System.out.print(frances.search(word).get(0) + " ");
                    }
                    if (idioma2 == 2){ // Si se quiere una traducción al español
                        System.out.print(frances.search(word).get(1) + " ");
                    }
                } else {
                    // De lo contrario, imprimimos la palabra encerrada en asteriscos
                    System.out.print("*" + word + "* ");
                }
            }
        }
        System.out.println();
    }

}
