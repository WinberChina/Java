package anno.test;

public class Fruit {

	public void displayName() {
		System.out.println("水果的名字是：");
	}
	
}

class Orange extends Fruit {
	@Override 
	public void displayName() {
		System.out.println("水果的名字是：橘子");
	}
}

class Apple extends Fruit {
	@Override
	public void displayName() {
		System.out.println("水果的名字是：苹果");
	}
}