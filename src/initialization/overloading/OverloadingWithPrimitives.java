package initialization.overloading;
/**
 * 测试overloading与primitive同时出现的情况。
 * @author zengqiang.wang
 *
 */
public class OverloadingWithPrimitives {
	/**
	 * ASCII码常见字符与十进制的对应关系：
	 * 65-A
	 * 97-a
	 * 48-0
	 * char在重载的时候比较特殊，如果代码中没有char类型，默认char提升为int。
	 * @param c
	 */
	static void f(char c) {
		System.out.println("char:" + c + ",its related integer is :" + (int)c);
	}
	static void f(byte b) {
		System.out.println("byte:" + b);
	}
	static void f(short s) {
		System.out.println("short:" + s);
	}
	static void f(int i) {
		System.out.println("int:" + i);
	}
	static void f(long l) {
		System.out.println("long:" + l);
	}
	static void f(float f) {
		System.out.println("float:" + f);
	}
	static void f(double d) {
		System.out.println("double:" + d);
	}
	
	public static void main(String[] args) {
		f('a');
	}
}
