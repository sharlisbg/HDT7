/**
 * @author: Sharis Barrios
 * Clase que hace el recorrido In-Order y lo devuelve
 */

public class InOrder <K, V> implements ITraversal<K, V> {

    private StringBuilder builder;

    // Constructor
    public InOrder() {
        builder = new StringBuilder();
    }

    @Override
    public void visit(TreeNode<K, V> node) {
        builder.append(node.getKey());
        builder.append(": ");
        builder.append(node.getValue().toString());
        builder.append(", ");
    }

    // Obtener resultado
    public String getResult() {
        return builder.toString();
    }
}
