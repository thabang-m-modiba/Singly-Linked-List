/**
 * @author Thabang Mamoloko
 */

/**
 * Blueprint for Nodes
 */
public class Node<T> implements IPosition<T>{
	private T element;
	private Node<T> next;
	

	/**
	 * Constructor
	 * @param element
	 * @param node
	 */
	public Node(T element, Node<T> next) {
		this.element = element;
		this.next = next;
	}


	/**
	 * @return the next
	 */
	public Node<T> getNext() {
		return next;
	}


	/**
	 * @param node the next to set
	 */
	public void setNext(Node<T> next) {
		this.next = next;
	}


	/**
	 * @param element the element to set
	 */
	public void setElement(T element) {
		this.element = element;
	}


	@Override
	public T getElement() {
		// TODO Auto-generated method stub
		return this.element;
	}

}
