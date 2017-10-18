package exercises.polymorphism;

import java.util.Random;

public class MusicRandGenerator {
	private Random random = new Random();
	
	public Instrument next() {
		switch(random.nextInt(5)) {
			default:
			case 0: return new Wind();
			case 1: return new Percussion();
			case 2: return new Stringed();
			case 3: return new Brass();
			case 4: return new Woodwind();
		}
	}
	
}
