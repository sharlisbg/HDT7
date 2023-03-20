import java.util.List;

public class Main {
    public static void main(String[] args) {
        String fileName = "diccionario.txt"; // nombre del archivo
        BinarySearchTree<String, List<String>> Ingles = LeerArchivo.leerArchivo(fileName, 0);

        Diccionario dic = new Diccionario(); 
        dic.setIngles(Ingles);
        System.out.println(dic.getIngles());

    }
}
