package exercises.initialization;

import print.Print;

class StringTest2 {
	String s1 = "s1 initialized";
	String s2 ;
	StringTest2() {
		s2 = "s2 initialized";
	}
}

public class ConstructorTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest2 st2 = new StringTest2();
		Print.print("s1 = " + st2.s1 + ", s2 = " + st2.s2);
	}
}
