package initialization;

public class Test9 {
	Test9() {
		this("hi");
		System.out.println("No-arg constructor!");
		//this("hi");
	}
	Test9(String s) {
		System.out.println(s);
	}
	void method() {
		//this();//Constructor call must be the first statement in a constructor
	}
	public static void main(String[] args) {
		new Test9();
	}
}
