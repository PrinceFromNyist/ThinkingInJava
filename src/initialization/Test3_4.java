package initialization;
/**
 * Create a class with a default constructor(one that takes
 * no arguments) that prints a message.Create an object
 * of this class.
 * @author zengqiang.wang
 *
 */
public class Test3_4 {
	Test3_4() {
		System.out.println("I'm a no-arg constructor(default constructor) "
				+ "of class Test3!");
	}
	Test3_4(String msg) {
		System.out.println("This is a constructor defined by myself:" + msg);
	}
	public static void main(String[] args) {
		Test3_4 test = new Test3_4();
		Test3_4 test1 = new Test3_4("Hello,I'm zengqiang.wang from qunar.com");
	}
}
