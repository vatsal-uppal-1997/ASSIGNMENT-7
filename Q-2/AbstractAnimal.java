abstract class Animals {
	private String color;
	private String breed;
	private String name;
	Animals(String name, String color, String breed) {
		this.name = name;
		this.color = color;
		this.breed = breed;
	}
	abstract void eat();
	public String getIntro() {
		return ("Hi I am "+this.name+" and i am of "+this.color+" color and my breed is "+this.breed+" and ");
	}
	public void speak() {
		System.out.println("I am an Animal and I speak !");
	}
}
class Dog extends Animals {
	Dog(String name, String color, String breed) {
		super(name,color,breed);
	}
	public void eat() {
		System.out.println(super.getIntro()+"I eat dog food");
	}
}
class Cat extends Animals {
	Cat(String name, String color, String breed) {
		super(name,color,breed);
	}
	public void eat() {
		System.out.println(super.getIntro()+"I eat cat food");
	}
}
public class AbstractAnimal {
	public static void main (String [] args) {
		Animals ref1;
		ref1 = new Dog("Casper","Black","Pitbull");
		ref1.speak();
		ref1.eat();
		ref1 = new Cat("Neko","White","Persian");
		ref1.speak();
		ref1.eat();
	}
}