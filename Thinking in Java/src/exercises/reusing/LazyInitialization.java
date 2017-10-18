package exercises.reusing;
class Speak {
	private String s;
	public Speak(String word) {
		System.out.println("Speak()");
		s = word;
	}
	public String toString() {
		return s;
	}
}

class Dog {
	private int height;
	private int weight;
	private Speak speak;
	public Dog() {
		System.out.println("Dog()");
		height = 20;
		weight = 10;
	}
	public void speak() {
		if(speak == null) {
			speak = new Speak("wang wang");
		}
		System.out.println("This Dog's height = " +height + ", weight = " + weight + ", word is " + speak);
	}
}
public class LazyInitialization {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog1 = new Dog();
		dog1.speak();
	}
}
/*
 * Output:
 * Dog()
 * Speak()
 * This Dog's height = 20, weight = 10, word is wang wang
 * */
