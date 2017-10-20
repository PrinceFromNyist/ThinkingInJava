package initialization;

public class Test7 {
	Test7() {
		System.out.println(this);
		System.out.println("===============");
	}
	public static void main(String[] args) {
		Test7 test = new Test7();
		System.out.println(test);
	}
}
