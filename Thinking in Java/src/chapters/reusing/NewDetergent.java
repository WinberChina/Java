package chapters.reusing;

public class NewDetergent extends Detergent {
	public void scrub() {
		append(" NewDetergent.scrub");
	}
	public void sterilize() {
		append(" sterilize()");
	}
	public static void main(String[] args) {
		NewDetergent newDe = new NewDetergent();
		newDe.dilute();
		newDe.apply();
		newDe.scrub();
		newDe.foam();
		newDe.sterilize();
		System.out.println(newDe);
		System.out.println("Testing base class:");
		Detergent.main(args);
	}
}
/*
 * Output:
 * Cleanser dilute() apply() NewDetergent.scrub Detergent.foam() sterilize
 * Testing base class:
 * Cleanser dilute() apply() Detergent.scrub scrub() Detergent.foam()
 * Testing base class:
 * Cleanser dilute() apply() scrub()
 * */
