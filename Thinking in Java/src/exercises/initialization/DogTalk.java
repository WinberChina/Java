package exercises.initialization;

class Dog {
	void bark() {System.out.println("quiet");}
	void bark(char c) {System.out.println("cawcaw");}
	void bark(byte b) {System.out.println("barkbark");}
	void bark(short s) {System.out.println("slurpslurp");}
	void bark(int i) {System.out.println("iyow");}
	void bark(long L) {System.out.println("lalala");}
	void bark(float f) {System.out.println("fififoofum");}
	void bark(double d) {System.out.println("dodo");}
	void bark(String s, int i) {
		System.out.println("String s : " + s + ", int i : " + i);
	}
	void bark(int i, String s) {
		System.out.println(", int i : " + i + "String s : " + s);
	}
}
public class DogTalk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		char c = 'c';
		byte b = 0;
		short s = 0;
		d.bark();
		d.bark(c);
		d.bark(b);
		d.bark(s);
		d.bark(1);
		d.bark(1L);
		d.bark(1.0f);
		d.bark(1.0);
		d.bark("bark5", 5);
		d.bark(6, "bark6");
	}

}
