package exercises.initialization;

public class StringVarArg {
	
	static void printStringArg(String... args) {
		for(String str : args) {
			System.out.println(str + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStringArg("one", "two", "three");
		printStringArg(new String[]{"a", "b", "c"});
	}

}
