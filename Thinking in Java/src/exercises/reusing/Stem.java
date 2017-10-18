package exercises.reusing;

/*class Component1 {
	Component1() {
		System.out.println("Component1");
	}
}

class Component2 {
	Component2() {
		System.out.println("Component2");
	}
}

class Component3 {
	Component3() {
		System.out.println("Component3");
	}
}

class Root {
	private Component1 c1root = new Component1();
	private Component2 c2root = new Component2();
	private Component3 c3root = new Component3();
	Root() {
		System.out.println("Root");
	}
}

public class Stem extends Root {
	private Component1 c1stem = new Component1();
	private Component2 c2stem = new Component2();
	private Component3 c3stem = new Component3();
	Stem() {
		System.out.println("Stem");
	}
	public static void main(String[] args) {
		Stem s1 = new Stem();
	}
}*/
class Component1 {
	Component1(int i) {
		System.out.println("Component1");
	}
	void dispose() {
		System.out.println("Component1 dispose");
	}
}

class Component2 {
	Component2(int i) {
		System.out.println("Component2");
	}
	void dispose() {
		System.out.println("Component2 dispose");
	}
}

class Component3 {
	Component3(int i) {
		System.out.println("Component3");
	}
	void dispose() {
		System.out.println("Component3 dispose");
	}
}

class Root {
	private Component1 c1root = new Component1(1);
	private Component2 c2root = new Component2(1);
	private Component3 c3root = new Component3(1);
	Root(int i) {
		System.out.println("Root");
	}
	void dispose() {
		c3root.dispose();
		c2root.dispose();
		c1root.dispose();
		System.out.println("Root dispose");
	}
}

public class Stem extends Root {
	private Component1 c1stem = new Component1(1);
	private Component2 c2stem = new Component2(1);
	private Component3 c3stem = new Component3(1);
	Stem(int i) {
		super(i);
		System.out.println("Stem");
	}
	void dispose() {
		c3stem.dispose();
		c2stem.dispose();
		c1stem.dispose();
		System.out.println("Stem dispose");
		super.dispose();
	}
	public static void main(String[] args) {
		Stem s1 = new Stem(10);
		try {
			
		} finally {
			s1.dispose();
		}
	}
}

