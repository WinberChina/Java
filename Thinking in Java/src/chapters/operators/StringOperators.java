package chapters.operators;

import print.Print;

public class StringOperators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0, y =1, z = 2;
		String s = "x, y, z ";
		Print.print(s + x + y +z);
		Print.print(x + "" + s);
		s += "(sumed) ";
		Print.print(s + (x + y + z));
		Print.print("" + x);
		if(x == y){
			
		}
	}

}
