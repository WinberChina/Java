package exercises.operators;

import print.Print;

public class DogCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog spot = new Dog("spot", "Ruff");
		Dog dog2 = new Dog("scruffy", "Wurf");
		Dog newDog = new Dog("" ,"");
		newDog = spot;
		Dog butch = new Dog("" ,"");
		butch.setName("Butch");
		butch.setSays("Hello!");
		butch.showName();
		butch.speak();
		Print.print("Comparison: ");
		Print.print("spot == butch: " + (spot == butch));
		Print.print("spot.equals(butch): " + spot.equals(butch));
		Print.print("butch.equals(spot): " + butch.equals(spot));
		Print.print("Now assign: spot = butch");
		spot = butch;
		Print.print("Compare again: ");
		Print.print("spot == butch: " + (spot == butch));
		Print.print("spot.equals(butch): " + spot.equals(butch));
		Print.print("butch.equals(spot): " + butch.equals(spot));
		Print.print("Spot: ");
		spot.showName();
		spot.speak();
		Print.print("Butch: ");
		butch.showName();
		butch.speak();
	}

}
