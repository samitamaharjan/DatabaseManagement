
public class Main {

	public static void main(String[] args) {
		FileManager fileManager = new FileManagerImpl();
		
		// User user = new User(1, "Samita");		
		// fileManager.write(user);
		
		User user = fileManager.read();
		System.out.println(user.getName());
	}

}
