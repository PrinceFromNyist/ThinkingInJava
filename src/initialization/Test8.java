package initialization;
/**
 * 
 * @author zengqiang.wang
 *
 */
public class Test8 {
	void method1() {
		System.out.println("method1");
		method2();
		this.method2();
		method1();
		/**
		 * if a method call itself,it will throw an exception as
		 * follows:
		 * Exception in thread "main" java.lang.StackOverflowError
		 * In other words,it will cause memory leak
		 */
		
	}
	void method2() {
		System.out.println("method2");
	}
	public static void main(String[] args) {
		Test8 test = new Test8();
		test.method1();
	}
}
