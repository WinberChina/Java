package exercises.reusing;

import java.util.Random;

public class FinalField {
	private static Random rand = new Random(47);
	private static final int a1 = rand.nextInt(20); 
	private final int a2 = rand.nextInt(20);
	
	public String toString() {
		return "a1 = " + a1 + ", a2 = " + a2;
	}
	public static void main(String[] args) {
		FinalField f1 = new FinalField();
		FinalField f2 = new FinalField();
		System.out.println(f1);
		System.out.println(f2);
	}
}
