package exercises.reusing;
class Amphibian {
	public void jump() {
		System.out.println("Amphibian jump");
	}
}
public class Frog extends Amphibian {
	public void jump() {
		System.out.println("Frog jump");
	}
	public static void main(String[] args) {
		Frog frog = new Frog();
		Amphibian am = frog;
		am.jump();
	}
}
