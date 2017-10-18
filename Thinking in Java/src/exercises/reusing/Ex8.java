package exercises.reusing;

class Ex1 {
	Ex1(char c, int i) {
		System.out.println("Ex1 Constructed");
	}
}

public class Ex8 extends Ex1 {
	Ex8() {
		super(' ', 0);
	}
	Ex8(char c, int i) {
		super(c, i);
	}
}
