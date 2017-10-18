package chapters.polymorphism;

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticDrived extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}
public class StaticPolymorphism {
	public static void main(String[] args) {
		StaticSuper sup = new StaticDrived();
		
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
		
	}
}
