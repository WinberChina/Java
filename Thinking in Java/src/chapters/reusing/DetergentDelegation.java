package chapters.reusing;

public class DetergentDelegation {
	private Cleanser cleanser = new Cleanser();
	public void append(String a) { cleanser.append(a); }
	public void dilute() { cleanser.dilute(); }
	public void apply() { cleanser.apply(); }
	public void scrub() {
		append(" Detergent.scrub");
		cleanser.scrub();
	}
	// Add new method
	public void foam() {
		append(" Detergent.foam()");
	}
	public static void main(String []args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("Testing base class:");
		Cleanser.main(args);
	}
}
