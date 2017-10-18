package exercises.initialization;

class StringConstructor {
	StringConstructor(String s) {
		System.out.println("InitTest..");
		System.out.println(s);
	}
}
public class ArrayConstructor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConstructor[] cA = new StringConstructor[5];
		for(int i = 0; i < cA.length; i++) {
			cA[i] = new StringConstructor(String.valueOf(i));
		}
	}

}
