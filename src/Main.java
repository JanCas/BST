
public class Main {

	public static void main(String[] args) {
		BST<Integer> bsti = new BST<Integer>(12);
		bsti.setLeft(7);
		bsti.setRight(19);
		bsti.insert(20);
		System.out.println(bsti.depth1());
		System.out.println(bsti);

	}

}
