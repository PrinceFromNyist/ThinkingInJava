package initialization.overloading;
/**
 * ����overloading��primitiveͬʱ���ֵ������
 * @author zengqiang.wang
 *
 */
public class OverloadingWithPrimitives {
	/**
	 * ASCII�볣���ַ���ʮ���ƵĶ�Ӧ��ϵ��
	 * 65-A
	 * 97-a
	 * 48-0
	 * char�����ص�ʱ��Ƚ����⣬���������û��char���ͣ�Ĭ��char����Ϊint��
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
