package initialization;
/**
 * Test the usage of this which is a reference of some class's
 * object
 * @author zengqiang.wang
 *
 */
public class Leaf {
	int i = 0;
	Leaf increment() {
		i++;
		return this;
	}
	void print() {
		System.out.println("i = " + i);
	}
	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		leaf.increment().increment().print();
	}
}
