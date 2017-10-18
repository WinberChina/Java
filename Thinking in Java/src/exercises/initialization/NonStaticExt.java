package exercises.initialization;

class NonStatic {
	String nonStr;
	{
		nonStr = "run away";
		System.out.println("nonStr is initialized nonStr = " + nonStr);
	}
}

public class NonStaticExt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NonStatic();
	}

}
