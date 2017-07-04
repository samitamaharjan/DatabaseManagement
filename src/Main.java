import java.util.List;

public class Main {

	public static void main(String[] args) {
		FileManager<User> userManager = new FileManagerImpl<>("user");
		
		userManager.clean();
		User james = new User(1, "James");
		User samita = new User(2, "Samita");
		userManager.insert(james);
		userManager.insert(samita);
		
		List<User> users = userManager.read();
		
		for(User u : users) {
			System.out.println(u.getId() + "\t" + u.getName());
		}
		
		FileManager<Book> bookManager = new FileManagerImpl<>("book");
		bookManager.clean();
		Book b1 = new Book("125", "Java");
		Book b2 = new Book("252", "Hadoop");
		bookManager.insert(b1);	
		bookManager.insert(b2);
		
		List<Book> books = bookManager.read();
		
		for(Book b : books) {
			System.out.println(b.getIsbn() + "\t" + b.getName());
		}
	}
}
