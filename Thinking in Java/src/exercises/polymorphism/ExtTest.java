package exercises.polymorphism;

class A {
	public void f() {
		System.out.println("A.f()");
		this.g();
	}

	public void g() {
		System.out.println("A.g()");
	}
}

class B extends A {
	public void f() {
		System.out.println("B.f()");
		this.g();
	}

	public void g() {
		System.out.println("B.g()");
	}
}

public class ExtTest {
	public static void main(String[] args) {
		A a = new B();
		a.f();
	}
}
/*
 * Output:
 * B.f()
 * B.g()
 * */
