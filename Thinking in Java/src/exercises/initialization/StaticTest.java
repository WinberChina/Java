package exercises.initialization;

class StaticInit {
	static String s1 = "s1 initialized";
	static String s2;
	static {
		s2 = "s2 initialized";
	}
	static void showStatics() {
		System.out.print("s1 = " + s1 + ", s2 = " + s2);
	}
}

public class StaticTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticInit.showStatics();
	}

}
