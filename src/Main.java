import java.util.List;

import com.project.manager.FileManager;
import com.project.manager.FileManagerImpl;
import com.project.model.Book;

public class Main {

	public static void main(String[] args) {
		FileManager<Book> bookManager = new FileManagerImpl<>("book");
		bookManager.clean();
		Book b1 = new Book("1111", "Java", true, null);
		Book b2 = new Book("2222", "Hadoop", true, null);
		Book b3 = new Book("3333", "Oracle", true, null);
		bookManager.insert(b1);
		bookManager.insert(b2);
		bookManager.insert(b3);
		
		List<Book> books = bookManager.findAll();
		
		for (Book b : books) {
			System.out.printf("%-15s %-15s%n",
				b.getISBN(), b.getTitle());
		}
		
		Book book = bookManager.findByPrimaryKey("2222");
		System.out.println("Book found: " + book.getTitle());
	}
}
