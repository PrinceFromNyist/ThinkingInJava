package initialization;

import java.util.Arrays;

public class Dog {
	void bark(char c,byte b) {
		System.out.println("barking(char):" + c + ",bark(int):" + b );
	}
	void bark(byte b,char c) {
		System.out.println("barking(byte):" + b + ",bark(char):" + c );
	}
	void bark(short s) {
		System.out.println("barking(short):" + s );
	}
	void bark(int i) {
		System.out.println("barking(int):" + i );
	}
	void bark(long l) {
		System.out.println("barking(long):" + l );
	}
	void bark(float f) {
		System.out.println("barking(float):" + f );
	}
	void bark(double d) {
		System.out.println("barking(double):" + d );
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		/**
		 * 第33,34行代码，可以给一个数组快速的批量添加一组数据
		 */
		String[] arguments = new String[7];
		//char[] arguments = new char[7];
		//Arrays.fill(arguments,'a');
		/**
		 * Exception in thread "main" java.lang.ArrayStoreException: java.lang.Character
		 */
		Arrays.fill(arguments,"aa");
//		for(String a : arguments) {
//			switch(a) {
//			case arguments[0]:
//				bark((char)a);
//			}
//			dog.bark(a);
//		}
		dog.bark('a');
		dog.bark(1);
		dog.bark(15);
		dog.bark(20);
		dog.bark(30L);
		dog.bark(0.3f);
		dog.bark(0.4);
		System.out.println("================");
		dog.bark('a', (byte)15);
		dog.bark((byte)15,'a');
	}
}
