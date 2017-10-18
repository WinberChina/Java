package exercises.initialization;

class VarargString {
	public static void main(String... args) {
		for(String arg : args) {
			System.out.print(arg + " ");
		}
		System.out.println();
	}
}
public class VarargExt20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VarargString.main("one", "two", "three");
		VarargString.main("1");
		VarargString.main("a", "b");
	}

}
