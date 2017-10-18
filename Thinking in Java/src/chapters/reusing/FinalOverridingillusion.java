package chapters.reusing;
import static net.mindview.util.Print.*;

class WithFinal {
	private final void f() {
		print("WithFinal.f()");
	}
	private void g() {
		print("WithFinal.g()");
	}
}

class OverridingPrivate extends WithFinal {
	private final void f() {
		print("OverridingPrivate.f()");
	}
	private void g() {
		print("OverridingPrivate.g()");
	}
}

class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		print("OverridingPrivate2.f()");
	}
	public void g() {
		print("OverridingPrivate2.g()");
	}
}
public class FinalOverridingillusion {
	public static void main(String[] args) {
		OverridingPrivate2 op = new OverridingPrivate2();
		op.f();
		op.g();
		OverridingPrivate op1 = op;
		// op1.f();
		// op1.g();
		WithFinal wf = op1;
		// wf.f();
		// wf.g();
	}
}
