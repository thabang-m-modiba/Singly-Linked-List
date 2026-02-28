/**
 * @author Thabang Mamoloko
 */

/**
 * Class defines methods for the singly linked list functionality
 */
public class PositionalList<T> implements IPositionalList<T>{
	private Node<T> head = null;
	int size = 0;
	/**
	 * Method to check if the list is empty or not
	 * @return true if empty & false if not empty
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public IPosition<T> addFirst(T element) {
		// TODO Auto-generated method stub
		Node<T> newNode = new Node<>(element, head);
		head = newNode;
		size++;
		return newNode;
	}

	@Override
	public IPosition<T> addAfter(IPosition<T> p, T element) {
		// TODO Auto-generated method stub
		Node<T> node = (Node<T>) p;
		Node<T> newNode = new Node<>(element, node.getNext());
		node.setNext(newNode);
		size++;
		return newNode;
	}

	@Override
	public T remove(IPosition<T> p) {
		// TODO Auto-generated method stub
		Node<T> node = (Node<T>) p;
		if(node == head) {
			head = head.getNext();
		}else {
			Node<T> current = head;
			
			while(current.getNext() != node) {
				current = current.getNext();
			}
			current.setNext(node.getNext());
		}
		size--;
		return node.getElement();
	}

	@Override
	public void printList() {
		// TODO Auto-generated method stub
		Node<T> current = head;
		
		while(current != null) {
			System.out.print(current.getElement() + " -> ");
			current = current.getNext();
		}
		System.out.println("null");
		
	}

}
