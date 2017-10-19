package initialization;
/**
 * Create a class containing an uninitialized String
 * reference.Demonstrate that this reference is initialized
 * by Java to null.
 * @author zengqiang.wang
 *
 */
public class Test1 {
	String str;
	public static void main(String[] args) {
		Test1 test1 = new Test1();
		System.out.println(test1.str);
	}
}
