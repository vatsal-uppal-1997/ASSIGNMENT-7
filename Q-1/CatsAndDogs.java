interface Animals {
	void speak();
	void eat();
}
class Dog implements Animals {
	public void speak() {
		System.out.println("Woof ! Woof !");
	}
	public void eat() {
		System.out.println("I eat dog food");
	}
}
class Cat implements Animals {
	public void speak() {
		System.out.println("Meow ! Meow !");
	}
	public void eat() {
		System.out.println("I eat cat food");
	}
}
public class CatsAndDogs {
	public static void main (String [] args) {
		Animals ref1;
		ref1 = new Dog();
		ref1.speak();
		ref1.eat();
		ref1 = new Cat();
		ref1.speak();
		ref1.eat();
	}
}