package initialization;
/**
 * Create a class with a String field that is initialized at the
 * point of definition,and another one that is initialized by
 * the constructor.What is the difference between the two
 * approaches?
 * @author zengqiang.wang
 *
 */
public class Test2 {
	String str = "default";
	String str2;
	Test2() {
		str2 = "initialized in constructor!";
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		System.out.println("str:" + test2.str + ",str2:" + test2.str2);
	}
}
