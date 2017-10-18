package exercise.polymorphism.shape;

import static net.mindview.util.Print.*;

public class Circle extends Shape {
	@Override
	public void draw() { print("Circle.draw()"); }
	@Override
	public void erase() { print("Circle.rease()"); }
	@Override
	public void printMessage() {
		print("Circle.printMessage()");
	}
}
