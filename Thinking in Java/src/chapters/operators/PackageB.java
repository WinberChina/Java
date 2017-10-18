package chapters.operators;
import chapters.reusing.*;
public class PackageB {
	public static void main(String[] args) {
		PackageA packageA = new PackageA();
		// packageA.test(); protected method is not visible out of package
	}
}
class PackageC extends PackageA {
	public void protectedTest() {
		super.test();
	}
	public static void main(String[] args) {
		
	}
}