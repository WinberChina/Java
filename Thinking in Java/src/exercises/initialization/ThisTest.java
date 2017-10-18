package exercises.initialization;

class This{
	void a(){
		System.out.println("1");
	}
	void b(){
		a();
		this.a();
	}
}
public class ThisTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This().b();
	}

}
