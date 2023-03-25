import java.util.List;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class BinarySearchTree<K, V> {

	private TreeNode<String, List<String>> root;
	private boolean isEmpty;
	private int count;
	
	/**

	Constructs an empty binary search tree with the specified comparator and key generator
	@param _keyComparator the comparator to use for comparing keys
	@param _keyGenerator the key generator to use for generating keys from values
	*/
	public BinarySearchTree() {
		root = null;
		isEmpty = true;
		count = 0;
	}
	
	
	/**

	Recursively inserts a new node into the tree
	@param actualNode the node currently being compared
	@param newNode the node to be inserted
	*/
	private void internalInsert(TreeNode<String, List<String>> actualNode, TreeNode<String, List<String>> newNode) {
		int result = actualNode.getKey().compareTo(newNode.getKey());
		//si actual es mayor entonces da un nuemero posito
		//si actual es menor entonces da un numero negativo
		//si son iguales da 0
		
		if (result > 0) { //Inserto el nuevo a la izquierda porque es menor
			if (actualNode.getLeft() == null) { //La izquierda esta vacia
				actualNode.setLeft(newNode);
				newNode.setParent(actualNode);
				count++;
			} else { //Existe nodo en la izquierda entonces ahora nuevo se compara con este
				internalInsert(actualNode.getLeft() ,newNode);
			}
		} else if (result < 0) { //Inserto el nuevo a la derecha porque es mayor
			if (actualNode.getRight() == null) { //La derecha esta vacia
				actualNode.setRight(newNode);
				newNode.setParent(actualNode);
				count++;
			} else { //Existe nodo en la derecha entonces ahora nuevo se compara con la derecha
				internalInsert(actualNode.getRight() ,newNode);
			}
		}
	}
	
	/**

	Inserts a node with the specified key and value into the tree
	@param id the key to be inserted
	@param value the value to be inserted
	*/
	public void insert(String id, List<String> value) {
	
		TreeNode<String, List<String>> newNode = new TreeNode<String, List<String>>(id, value);
		if (isEmpty()) {
			root = newNode;
			count++;
			isEmpty = false;
		} else {
			internalInsert(root, newNode);
		}
	}
	
	/**

	Returns true if the tree is empty, false otherwise
	@return true if the tree is empty, false otherwise
	*/
	public boolean isEmpty() {
		return isEmpty;
	}
	
	/**

	Searches the tree for the node with the specified key and returns its value
	@param key the key to search for
	@return the value of the node with the specified key, or null if no such node exists
	*/
	public List<String> search(String key) {
		return (List<String>) internalSearch(root, key);
	}

	// Retornar los valores de la lista de Search
	public String despliegueDeBusqueda(List<String> lista){
		StringBuilder sb = new StringBuilder();
        // Iterar a través de la lista y agregar cada elemento al StringBuilder
        for (String elemento : lista) {
            sb.append(elemento);
            sb.append(", ");
        }
        // Retornar el resultado como un String
        return sb.toString();
	}
	
	/**

	Recursively searches the tree for the node with the specified key and returns its value
	@param actual the node currently being compared
	@param key the key to search for
	@return the value serch
	*/
	private List<String> internalSearch(TreeNode<String, List<String>> actual, String key) {
		
		if (actual != null) {
			
			int result = actual.getKey().compareTo(key);
			
			// SI result es 0 entonces son iguales
			if (result == 0) {
				return actual.getValue();
			} else if (result > 0) {
				return (List<String>) internalSearch(actual.getLeft(), key);
			}else {
				return (List<String>) internalSearch(actual.getRight(), key);
			}
			
			
		} else {
			return null;
		}
		
		
	}
	
	public void InOrderTraversal(ITraversal<String, List<String>> visitador) {
		internalInOrder(root, visitador);
	}
	
	private void internalInOrder(TreeNode<String, List<String>> actual, ITraversal<String, List<String>> visitador) {
		
		if (actual != null) {
			
			if (actual.getLeft() != null) {
				internalInOrder(actual.getLeft(), visitador);
			}
			
			visitador.visit(actual);
			
			if (actual.getRight() != null) {
				internalInOrder(actual.getRight(), visitador);
			}
			
		}
		
	}
	
	
	public int count() {
		return count;
	}
}
