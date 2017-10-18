package exercises.operators;

import print.Print;

public class StringTest {
	static void stringEqualTest(String s1, String s2){
		Print.print("s1 : " + s1);
		Print.print("s2 : " + s2);
		Print.print(String.valueOf("s1 == s2 : " + s1 == s2));
		Print.print(String.valueOf("s1 != s2 : " + s1 == s2));
		Print.print(String.valueOf("s1.eqauls(s2) : " + s1.equals(s2)));
		Print.print(String.valueOf("!s1.eqauls(s2) : " + !s1.equals(s2)));
	}
	public static void main(String[] args){
		String s1 = "aTest";
		String s2 = "aTest";
		stringEqualTest(s1, s2);
	}
}
