
public class BST<T extends Comparable<T>> {
	private T datum;
	private BST<T> left;
	private BST<T> right;

	public BST(T datum) {
		this.datum = datum;
		this.left = null;
		this.right = null;
	}

	public T getDatum() {
		return datum;
	}

	public BST<T> getLeft() {
		return left;
	}

	public void setLeft(T left) {
		this.left = new BST<T>(left);
	}

	public BST<T> getRight() {
		return right;
	}

	public void setRight(T right) {
		this.right = new BST<T>(right);
	}

	public int depth1() {

		if (this.right == null && this.left == null) {
			return 1;
		} else if (left == null) {
			return right.depth1() + 1;
		} else if (right == null) {
			return left.depth1() + 1;
		} else {

			int leftcount = left.depth1();
			int rightcount = right.depth1();
			return Math.max(leftcount, rightcount) + 1;
		}
	}

	public void insert(T datum) {

		if (this.datum == null) {

			this.datum = datum;

		} else {
			if (datum.compareTo(this.datum) < 0) {
				if (left == null) {
					this.setLeft(datum);
				} else {
					left.insert(datum);
				}
			}

			if (datum.compareTo(this.datum) > 0) {
				if (right == null) {
					this.setRight(datum);
				} else {
					right.insert(datum);
				}
			}

		}

	}

	public int PathLength(T datum) {
		if (datum == null) {
			return 1;

		} else {
			if (datum.compareTo(this.datum) < 0) {
				if (left == null) {
					return 1;
				} else {
					return 1 + left.PathLength(datum);
				}
			}

			if (datum.compareTo(this.datum) > 0) {
				if (right == null) {
					return 1;
				} else {
					return 1 + right.PathLength(datum);
				}
			}

		}
		return 1;
	}

	public boolean isInTree(T datum) {
		if (datum == null) {
			return false;

		} else {
			if (datum.compareTo(this.datum) < 0) {
				if (left == null) {
					return false;
				} else {
					return left.isInTree(datum);
				}
			}

			if (datum.compareTo(this.datum) > 0) {
				if (right == null) {
					return false;
				} else {
					return right.isInTree(datum);
				}
			}

		}
		return true;
	}
	
	public void delete(T datum){
		if(this.datum == null){
			System.out.println("fasle");
		}
	}

	public String toString() {
		String s = "" + datum + ", ";
		if (left != null)
			s = s + left.toString();
		if (right != null)
			s = s + right.toString();
		return s;
	}

}
