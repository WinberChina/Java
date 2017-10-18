package exercises.reusing;

class OverLoading {
	int overLoading(int i) {
		System.out.println("int overLoading(int i)");
		return i;
	}
	int overLoading(String i) {
		System.out.println("String overLoading(int i)");
		return Integer.parseInt(i);
	}
	int overLoading(char c) {
		System.out.println("char overLoading(int i)");
		return c;
	}
}

public class OverLoadingTest extends OverLoading{
	String overLoading(double i) {
		System.out.println("double overLoading(int i)");
		return "11";
	}
	public static void main(String[] args) {
		OverLoadingTest ot = new OverLoadingTest();
		ot.overLoading(1);
		ot.overLoading("1");
		ot.overLoading('d');
		ot.overLoading(0.9);
	}
}
