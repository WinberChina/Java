package exercises.polymorphism;

import static net.mindview.util.Print.*;

class Cycle {
	private String name = "Cycle";
	public static void travel(Cycle c) {
		print("Cycle travel: " + c);
	}
	public String toString() {
		return this.name;
	}
}

class Unicycle extends Cycle {
	private String name = "Unicycle";
	
	public String toString() {
		return this.name;
	}
}

class Bicycle extends Cycle {
	private String name = "Bicycle";
	
	public String toString() {
		return name;
	}
}

class Tricycle extends Cycle {
	private String name = "Tricycle";
	
	public String toString() {
		return name;
	}
}
public class CycleTest {
	public static void ride(Cycle c) {
		Cycle.travel(c);
	}
	public static void main(String[] args) {
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());
	}
}
