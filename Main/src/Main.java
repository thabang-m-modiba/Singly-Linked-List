/**
 * @author Thabang Mamoloko
 */

/**
 * Main class contains the main method
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PositionalList<String> list = new PositionalList<>();
		
		IPosition<String> p1 = list.addFirst("A");
		IPosition<String> p2 = list.addAfter(p1, "B");
		IPosition<String> p3 = list.addAfter(p2, "C");
		
		list.printList();
		list.remove(p3);
		list.printList();
	}

}
