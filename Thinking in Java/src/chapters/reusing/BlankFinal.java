package chapters.reusing;

class Poppet {
	private int i;
	Poppet(int ii) {
		i = ii;
	}
}
public class BlankFinal {
	private final int i = 0;
	private final int j;
	private final Poppet poppet;
	BlankFinal() {
		j = 1;
		poppet = new Poppet(1);
	}
	BlankFinal(int j) {
		this.j = j;
		poppet = new Poppet(j);
	}
	public static void main(String[] args) {
		BlankFinal b1 = new BlankFinal();
		// b1.poppet = new Poppet(2); cannot be changed once initialized
		new BlankFinal(22);
	}
}
