import java.util.List;

public class Diccionario {
    private BinarySearchTree<String, List<String>> ingles;
    private BinarySearchTree<String, List<String>> espanol;
    private BinarySearchTree<String, List<String>> frances;


    public Diccionario() {
        this.ingles = new BinarySearchTree<String, List<String>>();
        this.espanol = new BinarySearchTree<String, List<String>>();
        this.frances = new BinarySearchTree<String, List<String>>();
    }


    public BinarySearchTree<String,List<String>> getIngles() {
        return this.ingles;
    }

    public void setIngles(BinarySearchTree<String,List<String>> ingles) {
        this.ingles = ingles;
    }

    public BinarySearchTree<String,List<String>> getEspanol() {
        return this.espanol;
    }

    public void setEspanol(BinarySearchTree<String,List<String>> espanol) {
        this.espanol = espanol;
    }

    public BinarySearchTree<String,List<String>> getFrances() {
        return this.frances;
    }

    public void setFrances(BinarySearchTree<String,List<String>> frances) {
        this.frances = frances;
    }

}
