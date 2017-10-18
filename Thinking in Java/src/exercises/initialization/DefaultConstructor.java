package exercises.initialization;

class TestDefaultConstructor {
	TestDefaultConstructor() {
		System.out.println("you have created an object of TestDefaultConstructor");
	}
	TestDefaultConstructor(String s) {
		System.out.println(s + ": you have created an object of TestDefaultConstructor");
	}
}
public class DefaultConstructor {
	public static void main(String[] args) {
		TestDefaultConstructor d = new TestDefaultConstructor();
		TestDefaultConstructor d2 = new TestDefaultConstructor("d2");
	}
}
