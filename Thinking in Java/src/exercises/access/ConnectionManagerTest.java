package exercises.access;

class ConnectionTest {
	private ConnectionTest() {
		System.out.println("ConnectionTest Connected");
	}
	public static ConnectionTest makeConnectionTest() {
		return new ConnectionTest();
	}
}
public class ConnectionManagerTest {
	static int howManyLeft = 3;
	static  ConnectionTest[] ca= new ConnectionTest[3];
	{
		for(ConnectionTest ct : ca) {
			ct = ConnectionTest.makeConnectionTest();
		}
	}
	public static ConnectionTest getConnection() {
		if(howManyLeft > 0)
			return ca[--howManyLeft];
		else {
			System.out.println("No more connections");
			return null;
		}
	}
	public static void main(String[] args) {
		ConnectionManagerTest cm = new ConnectionManagerTest();
		System.out.println(cm.howManyLeft);
		cm.getConnection();
		System.out.println(howManyLeft);
		cm.getConnection();
		System.out.println(howManyLeft);
		cm.getConnection();
		System.out.println(cm.getConnection());
		System.out.println(howManyLeft);
	}

}
