import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        String fileName = "diccionario.txt"; // nombre del archivo

        //Creación de diccionario y lectura de archivo para crear los tres tipos de diccionarios
        Diccionario dic = new Diccionario(); 
        BinarySearchTree<String, List<String>> Ingles = LeerArchivo.leerArchivo(fileName, 0);
        dic.setIngles(Ingles);
        BinarySearchTree<String, List<String>> Espanol = LeerArchivo.leerArchivo(fileName, 1);
        dic.setEspanol(Espanol);
        BinarySearchTree<String, List<String>> Frances = LeerArchivo.leerArchivo(fileName, 2);
        dic.setFrances(Frances);

        // Búsqueda In-Order
        InOrder<String, List<String>> visitor = new InOrder<>();

        String menu = "Bienvenido a su diccionario\nQue desea realizar: \n1. Buscar traduccion de palabras. \n2. Recorrer diccionario (in-Order).\n3. Traducir palabras. \n4. Salir ";
        System.out.println(menu);
        int opcion = in.nextInt(); 
        in.nextLine();
        while(opcion < 4){
            switch (opcion){
                case 1:{ // Se ingresa la palabra y se traduce a los otros dos idiomas
                    System.out.println("En que diccionario se encuentra su palabra: 1. Ingles 2. Espaniol 3. Frances (ingrese el número)");
                    int tipodic = in.nextInt();
                    in.nextLine();
                    System.out.println("Ingrese la palabra que desea traducir. (En minuscula)");
                    String palabra = in.nextLine();
                    // Retorno 
                    System.out.println("La palabra "+palabra+ "traducida es:");
                    System.out.println(dic.Idioma(tipodic, palabra));
                    break;
                }

                case 2:{
                    System.out.println("Que diccionario desea recorrer: 1. Ingles 2. Espaniol 3. Frances (ingrese el número)");
                    int tipodic = in.nextInt();
                    in.nextLine();
                    dic.tipoArbol(tipodic).InOrderTraversal(visitor);
                    String resultado = visitor.getResult();
                    System.out.println(resultado);
                    break;
                }

                case 3:{
                    break;
                }
            }
            System.out.println(menu);
            System.out.println("Ingrese la opcion que desea: ");
            opcion = in.nextInt();
            in.nextLine();
        }
    }
}
