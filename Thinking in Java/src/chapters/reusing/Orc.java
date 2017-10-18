package chapters.reusing;
import net.mindview.util.Print.*;

class Villain {
	private String name;
	protected void set(String nm) { name = nm;}
	public Villain(String name) {
		this.name = name;
	}
	public String toString() {
		return "I¡¯m a Villain and my name is " + name;
	}
}
public class Orc extends Villain {
	private int orcNumber;
	
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber) {
		set(name);
		this.orcNumber = orcNumber;
	}
	
	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
	
	public static void main(String[] args) {
		Orc orc = new Orc("Li", 12);
		System.out.println(orc);
		orc.change("HuangShaojun", 2);
		System.out.println(orc);
	}
}
/*
 * Output:
 * Orc 12: I'm a Villain and my name is Li
 * Orc 2: I'm a Villain and my name is HuangShaojun
 * */
