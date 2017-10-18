package chapters.initialization;

class B {}
public class VarArgsTest {
	static void printArray(Object[] args) {
		for(Object object : args) {
			System.out.print(object + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray(new Object[]{new Integer(1), new Float(3.14), new Double(3.1415926)});
		printArray(new Object[]{"one", "two", "three"});
		printArray(new Object[]{new B(), new B(), new B()});
	}

}
