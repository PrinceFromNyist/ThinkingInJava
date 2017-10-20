package initialization;
/**
 * There is a scene:
 * A person will eat an apple,before he does it,he need use peeler
 * to peel the apple.
 * This scene includes three important class:Person,Peeler,Apple
 * @author zengqiang.wang
 *
 */
class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy£¡");
	}
}
class Peeler {
	/**
	 * a utility method which is to peel an apple
	 * @param apple
	 * @return
	 */
	static Apple peel(Apple apple) {
		return apple;
	}
}
class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
public class PassingThis {
	public static void main(String[] args) {
		//new Person().eat(new Apple());
		Person person = new Person();
		print(person);
		Apple apple = new Apple();
		print(apple);
		person.eat(apple);
		
	}
	/**
	 * print a object on the console.
	 * @param obj something which will be printed to console
	 */
	static void print(Object obj) {
		System.out.println(obj);
	}
}
