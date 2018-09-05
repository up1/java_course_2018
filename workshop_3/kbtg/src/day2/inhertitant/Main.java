package day2.inhertitant;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		speak(dog, "hahaha");
		speak(cat, "hahaha");
	}

	private static void speak(Animal animal
			, String message) {
		animal.speak(message);
	}

}

class Animal {
	public void speak(String message) {
		System.out.println("Animal " + message);
	}
}

class Dog extends Animal {
	@Override
	public void speak(String message) {
		System.out.println("Dog " + message);
	}
}

class Cat extends Animal {
	@Override
	public void speak(String message) {
		System.out.println("Cat " + message);
	}
}
