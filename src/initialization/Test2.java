package initialization;

public class Test2 {
	String str = "default";
	Test2() {
		str = "initialized in constructor!";
	}
	public static void main(String[] args) {
		Test2 test2 = new Test2();
		System.out.println(test2.str);
	}
}
