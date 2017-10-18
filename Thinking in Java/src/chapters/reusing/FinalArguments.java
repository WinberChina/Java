package chapters.reusing;

class Gizmo {
	public void spin() {
	}
}

public class FinalArguments {
	void with(final Gizmo gizmo) {
		// gizmo = new Gizmo();
	}

	void withOut(Gizmo gizmo) {
		gizmo = new Gizmo();
		gizmo.spin();
	}
	// void f(final int i) { i++; } // Can¡¯t change
	// You can only read from final primitive
	int g(final int i) { return i + 1; }
	public static void main(String[] args) {
		FinalArguments fa = new FinalArguments();
		FinalArguments fb = new FinalArguments();
	}
}
