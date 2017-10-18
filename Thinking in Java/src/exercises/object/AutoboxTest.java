package exercises.object;

// TIJ4 Chapter Object, Exercise 9, page 90
// Write a program that demonstrates that autoboxing works for all the primitive // types and their wrappers.

public class AutoboxTest {
	public static void main(String[] args) {
		boolean b = false;
		char c = 'x';
		byte t = 8;
		short s = 16;
		int i = 32;
		long l = 64;
		float f = 0.32f;
		double d = 0.64;
		Boolean B = new Boolean(b);
		System.out.println("boolean b = " + b); 		
		System.out.println("Boolean B = " + B); 
		Character C = new Character(c);
		System.out.println("char c = " + c);
		System.out.println("Character C = " + C);
		Byte T = new Byte(t);
		System.out.println("byte t = " + t);
		System.out.println("Byte T = " + T);
		Short S = new Short(s);
		System.out.println("short s = " + s);
		System.out.println("Short S = " + S);
		Integer I = new Integer(i);
		System.out.println("int i = " + i);
		System.out.println("Integer I = " + I);
		Long L = new Long(l);
		System.out.println("long l = " + l);
		System.out.println("Long L = " + L);
		Float F = new Float(f);
		System.out.println("float f = " + f);
		System.out.println("Float F = " + F);
		Double D = new Double(d);
		System.out.println("double d = " + d);
		System.out.println("Double D = " + D);		
	}
}