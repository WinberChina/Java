package exercises.operators;

import print.Print;

class Box {
	float f;
}

public class PassObject {
	static void f(Box b) {
		b.f = 3.1415f;
	}
	public static void main(String[] args){
		Box b1 = new Box();
		b1.f = 1.111f;
		Print.print("1: b1.f: " + b1.f);
		f(b1);
		Print.print("2: b1.f: " + b1.f);
	}
}
