package exercises.reusing;
import static net.mindview.util.Print.*;

public class SpecificBeetle extends Beetle {
	private int l = printInit("SpecificBeetle.l initialized");
	private static int x3 = printInit("satic SpecificBeetle.x3 initialized");
	
	public SpecificBeetle() {
		print("l = " + l);
		print("j = " + j);
	}
	public static void main(String[] args) {
		print("Specific constructor");
		SpecificBeetle sb = new SpecificBeetle();
	}
}
/*Output:
 * static Insect.x1 initialized
 * static Beetle.x2 initialized
 * static Specific.x3 initialized
 * Specific constructor
 * i = 9, j = 0
 * Beetle.k initialized
 * k = 49
 * j = 39
 * Specific.l initialized
 * l = 49
 * j = 39
 * */
