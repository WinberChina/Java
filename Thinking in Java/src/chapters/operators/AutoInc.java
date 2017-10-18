package chapters.operators;

import print.Print;

public class AutoInc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		Print.print("i : " + i);
		Print.print("++i : " + ++i); //Pre-Increment
		Print.print("i++ : " + i++); //Post-Increment
		Print.print("i : " + i);
		Print.print("--i : " + --i);
		Print.print("i-- : " + i--);
		Print.print("i : " + i);
	}

}
