// access/ConnectionManager.java
// TIJ4 Chapter Access, Exercise 8, page 233
/* Following the form of the example Lunch.java, create a class called
* ConnectionManager that manages a fixed array of Connection objects. The client
* programmer must not be able to explicitly create Connection objects, but can
* only get them via a static method in ConnectionManager. When ConnectionManager
* runs out of objects, it returns a null reference. Test the classes in main(). */
package exercises.access;

class Connection {
	private Connection() { System.out.println("Connection()");}
	// Allow creation via static method:
	static Connection makeConnection() {
		return new Connection();
	}
}

public class ConnectionManager {
	static int howManyLeft = 3;
	static Connection[] ca = new Connection[3];	
	{
		for(Connection x : ca)
			x = Connection.makeConnection();
	}
	public static Connection getConnection() {
		if(howManyLeft > 0)
			return ca[--howManyLeft];
		else {
			System.out.println("No more connections");
			return null;
		}
	}
	public static void main(String[] args) {		
		ConnectionManager cm = new ConnectionManager();
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