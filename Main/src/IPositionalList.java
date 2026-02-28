/**
 * @author Thabang Mamoloko
 */

/**
 * Interface contains methods for singly linked list functionality
 */
public interface IPositionalList<T> {
	IPosition<T> addFirst(T element);
	IPosition<T> addAfter(IPosition<T> p, T element);
	T remove(IPosition<T> p);
	void printList();
}
