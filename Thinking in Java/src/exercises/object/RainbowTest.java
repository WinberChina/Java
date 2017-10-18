package exercises.object;

public class RainbowTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllTheColorsOfTheRainbow rainBow = new AllTheColorsOfTheRainbow();
		rainBow.anIntegerRepresentingColors = 1;
		System.out.println("change before rainBow.anIntegerRepresentingColors="+rainBow.anIntegerRepresentingColors);
		rainBow.changeTheHueOfTheColor(7);
		System.out.println("change after rainBow.anIntegerRepresentingColors="+rainBow.anIntegerRepresentingColors);
	}

}

class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors;

	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = newHue;
		// ...
	}
	// ...
}
