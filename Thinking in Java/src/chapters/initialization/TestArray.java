package chapters.initialization;

public class TestArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] A = new String[2][2];
		A[0] = new String [] {"0","1"};
		A[1] = new String [] {"2","3"};
		for(int i=0; i < 2; i++) {
			System.out.println(A[1][i]);
		}
	}

}
