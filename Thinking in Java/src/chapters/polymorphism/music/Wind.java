package chapters.polymorphism.music;

import static net.mindview.util.Print.*;

// Wind objects are instruments
// Because they have the same interface
public class Wind extends Instrument{
	// Redefine interface method
	public void play(Note n) {
		print("Wind.play() " + n);
	}
}
