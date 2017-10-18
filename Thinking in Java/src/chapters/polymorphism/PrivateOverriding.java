package chapters.polymorphism;

import static net.mindview.util.Print.*;
public class PrivateOverriding {
	private void f() {
		print("private f()");
	}

	public static void main(String[] args) {
		PrivateOverriding po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverriding {
	public void f() {
		print("public f()");
	}
}
